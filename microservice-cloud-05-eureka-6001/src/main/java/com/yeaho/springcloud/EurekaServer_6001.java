package com.yeaho.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: yeaho_lee
 * @description:
 * @date: 12:18 2020/3/31
 */
@SpringBootApplication
/**
 * 服务注册中心
 */
@EnableEurekaServer
public class EurekaServer_6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_6001.class, args);
    }
}
