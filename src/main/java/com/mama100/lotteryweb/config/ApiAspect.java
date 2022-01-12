package com.mama100.lotteryweb.config;

import com.mama100.lotteryweb.util.JacksonUtil;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description:
 *
 * @author Moss Zeng
 * @date 2017年6月12日上午9:31:24
 */
@Aspect // 定义一个切面
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
@Log4j2
public class ApiAspect {
    // 定义切点Pointcut
    @Pointcut("@within(io.swagger.annotations.Api)")
    public void execController() {
    }

    @Around("execController()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();
        String uri = request.getRequestURI();
        Object[] paramsArray = pjp.getArgs();
        log.info("开始调用{} ", uri);
        if (paramsArray != null && paramsArray.length > 0) {
            for (int i = 0; i < paramsArray.length; i++) {
                if (paramsArray[i] instanceof BindingResult
                        || paramsArray[i] instanceof HttpServletRequest
                        || paramsArray[i] instanceof HttpServletResponse
                        || paramsArray[i] instanceof MultipartFile) {
                    continue;
                }
                log.info("params: {}", toJson(paramsArray[i]));
            }
        }

        // result的值就是被拦截方法的返回值
        long startTime = System.currentTimeMillis();
        Object result = pjp.proceed();

        log.info("结束调用{}，cost{} ms ,response:{} ", uri, System.currentTimeMillis() - startTime, toJson(result));
        return result;
    }

    private String toJson(Object o) {
        String r = null;
        try {
            r = JacksonUtil.to(o);
        } catch (Exception e) {
            log.error("JacksonUtil转换失败，因为{},改用JsonUtil转换", e.getMessage());
        }
        return r;
    }
}
