package com.service.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author daizhihong
 * @create 2022/6/26 19:53
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8006.class, args);
    }
}
