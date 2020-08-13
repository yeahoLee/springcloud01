package com.yeaho.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author : yeaho_lee
 * @Description : TODO
 * @createTime : 2020年08月13日 17:20
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard_9001.class, args);
    }
}
