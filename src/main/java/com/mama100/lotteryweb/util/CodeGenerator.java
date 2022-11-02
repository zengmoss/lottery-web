package com.mama100.lotteryweb.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateType;
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
        FastAutoGenerator.create(new DataSourceConfig
                .Builder( "jdbc:oracle:thin:@test-oracle.biostime.it:1521/mama100", "MAMA100_OWNER", "DFIcieAIO0Mg2M")
                .schema("MAMA100_ODS"))
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
                    builder.enableSchema()
                            .addInclude("TR_AWARD_BIOSTIME_DETAILED","TR_RETURN_BIOSTIME_DETAILED") // 设置需要生成的表名
                            /*.addTablePrefix("t_", "c_")*/// 设置过滤表前缀
                    //.likeTable(new LikeTable("problem_", SqlLike.RIGHT))
                    .entityBuilder().disableSerialVersionUID().enableLombok().build();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
