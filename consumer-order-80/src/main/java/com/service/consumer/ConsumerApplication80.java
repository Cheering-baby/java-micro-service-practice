package com.service.consumer;

import com.service.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication()
@EnableEurekaClient
@RibbonClient(name = "PAYMENT-SERVICE", configuration = MySelfRule.class)
public class ConsumerApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication80.class, args);
    }
}
