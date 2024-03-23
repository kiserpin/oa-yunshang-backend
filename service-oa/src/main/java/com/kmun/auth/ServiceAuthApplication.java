package com.kmun.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//springBoot启动类注解
@SpringBootApplication
//所有需要扫描的包
@ComponentScan("com.kmun")
//Mapper文件扫描
@MapperScan("com.kmun.*.mapper")

//标准的springboot启动类
public class ServiceAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAuthApplication.class, args);
    }
}