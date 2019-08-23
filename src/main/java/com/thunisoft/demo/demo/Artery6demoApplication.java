package com.thunisoft.demo.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@MapperScan({"com.thunisoft.demo.demo.mapper"})
@SpringBootApplication
public class Artery6demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Artery6demoApplication.class, args);
    }

}
