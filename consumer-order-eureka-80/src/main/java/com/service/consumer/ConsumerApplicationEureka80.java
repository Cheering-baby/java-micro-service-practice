package com.service.consumer;

import com.service.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author daizhihong
 * @create 2022/6/27 21:24
 **/

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "PAYMENT-SERVICE", configuration = MySelfRule.class)
public class ConsumerApplicationEureka80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationEureka80.class, args);
    }
}
