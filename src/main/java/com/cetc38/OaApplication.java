package com.cetc38;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cetc38.mapper")
public class OaApplication {

    public static void main(String[] args) {

        SpringApplication.run(OaApplication.class, args);
    }
}
