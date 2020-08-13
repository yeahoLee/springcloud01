package com.yeaho.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
@MapperScan("com.yeaho.springcloud.mapper")
@EnableEurekaClient
public class ProviderHystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrix_8001.class, args);
    }
}
