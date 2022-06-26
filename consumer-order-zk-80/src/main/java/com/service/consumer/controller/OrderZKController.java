package com.service.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author daizhihong
 * @create 2022/6/26 14:02
 **/

@RestController
public class OrderZKController {
    private static final String INVOKE_URL = "http://payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/zk")
    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        return result;
    }
}
