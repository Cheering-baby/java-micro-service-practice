package com.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author daizhihong
 * @create 2022/6/26 13:59
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZKApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerZKApplication80.class, args);
    }
}
