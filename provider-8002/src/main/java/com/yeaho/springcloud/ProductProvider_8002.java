package com.yeaho.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.yeaho.springcloud.mapper")
@EnableEurekaClient
public class ProductProvider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8002.class, args);
    }
}
