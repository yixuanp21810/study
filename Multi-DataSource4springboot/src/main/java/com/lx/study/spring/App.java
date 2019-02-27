package com.lx.study.spring;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages= "com.lx.study.spring.mapper")
@MapperScan("com.lx.study.spring.mapper")
@ComponentScan({"com.lx.study.spring","com.lx.study"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
