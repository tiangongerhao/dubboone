package com.yyb.dubboone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName Main类
 * @Description 核心启动类
 * @Author yyb
 * @Date 2019/5/24 17:14
 * @Vsion 1.0
 **/
@SpringBootApplication
@ImportResource(value ={"classpath:spring/spring-jdbc.xml","classpath:spring/spring-dubbo.xml"})
@MapperScan(basePackages = "com.yyb.dubboone.mapper")
@EnableScheduling
public class BootMoreApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(BootMoreApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BootMoreApplication.class);
    }


}
