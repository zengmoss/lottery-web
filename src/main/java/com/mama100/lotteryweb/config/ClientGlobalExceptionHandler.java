package com.mama100.lotteryweb.config;

import com.mama100.lotteryweb.po.BaseRes;
import com.mama100.lotteryweb.util.Constant;
import com.mama100.lotteryweb.util.JacksonUtil;
import com.mama100.lotteryweb.util.SeqNoHolder;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestClientException;

import javax.security.auth.login.LoginException;
import java.io.IOException;
import java.util.Optional;

/**
 * Description:
 *
 * 统一异常处理
 *
 * @author Moss Zeng
 * @date 2017年10月20日上午10:44:47
 */
@ControllerAdvice
@ResponseBody
@Log4j2
public class ClientGlobalExceptionHandler {

	/**
	 * 校验提醒
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(BindException.class)
	public BaseRes handleException(BindException e) {
		log.warn("校验失败，{}", e.getMessage());
		return getAccessToken(Optional.ofNullable(e).map(BindException::getFieldError)
				.map(FieldError::getDefaultMessage).orElse(e.getMessage()));
	}

	/**
	 * 校验提醒
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public BaseRes handleException(MethodArgumentNotValidException e) {
		log.warn("校验失败，{}", e.getMessage());
		return getAccessToken(Optional.ofNullable(e).map(MethodArgumentNotValidException::getBindingResult)
				.map(BindingResult::getFieldError).map(FieldError::getDefaultMessage).orElse(e.getMessage()));
	}

	@ExceptionHandler(IOException.class)
	public BaseRes handleConnectException(IOException e) {
		log.error(e.getMessage(), e); // 记录错误信息
		return res(Constant.SYSTEM_ERROR, " 超时未响应！请重试或联系客服获取帮助！");
	}

	@ExceptionHandler(RestClientException.class)
	public BaseRes handleRestClientException(RestClientException e) {
		log.error(e.getMessage(), e); // 记录错误信息
		return res(Constant.SYSTEM_ERROR, " 超时未响应！请重试或联系客服获取帮助！");
	}
	@ExceptionHandler(LoginException.class)
	public BaseRes handleException(LoginException e) {
		log.warn("登录相关失败，{}", e.getMessage());
		return  res("601",e.getMessage());
	}
	@ExceptionHandler(Exception.class)
	public BaseRes handleException(Exception e) {
		log.error(e.getMessage(), e);
		return res(Constant.SYSTEM_ERROR, e.getMessage());
	}

	private BaseRes getAccessToken(String desc) {
		return res("accessToken不能为空".equals(desc) ? "601" : Constant.BUSINESS_ERROR, desc);
	}

	private BaseRes res(String code, String desc) {
		BaseRes res = new BaseRes();
		res.setSeqNo(SeqNoHolder.holdSeqNo());
		res.setCode(code);
		res.setDesc(desc);
		log.info("出现异常，返回{}", JacksonUtil.to(res));
		return res;
	}
}
