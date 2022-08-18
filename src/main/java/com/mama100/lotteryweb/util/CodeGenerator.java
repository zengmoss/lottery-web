package com.mama100.lotteryweb.util;

import com.baomidou.mybatisplus.core.enums.SqlLike;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * *
 * *@author   Moss
 * *2022/8/17
 **/
public class CodeGenerator {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        FastAutoGenerator.create("jdbc:mysql://10.50.115.114:16052/swisse?characterEncoding=utf-8", "swisse", "swisse")
                .globalConfig(builder -> {
                    builder.author("moss") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .outputDir(projectPath +"/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.entity("po").parent("com.mama100.lotteryweb") // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, projectPath +"/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .templateConfig(builder -> {
                    builder.disable(TemplateType.SERVICE,TemplateType.SERVICEIMPL,TemplateType.CONTROLLER);
                })
                .strategyConfig(builder -> {
                    builder/*.addInclude("log_baseInfo")*/ // 设置需要生成的表名
                            /*.addTablePrefix("t_", "c_")*/// 设置过滤表前缀
                    .likeTable(new LikeTable("bw_", SqlLike.RIGHT))
                    .entityBuilder().enableLombok().build();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
