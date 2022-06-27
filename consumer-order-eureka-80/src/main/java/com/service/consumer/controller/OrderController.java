package com.service.consumer.controller;

import com.service.common.common.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author daizhihong
 * @create 2022/6/27 21:49
 **/
@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/get")
    public CommonResult get(@RequestParam Long id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        log.info("params: {}", params);
        CommonResult result = restTemplate.getForObject(PAYMENT_URL + "/payment/get?id={id}", CommonResult.class, params);
        System.out.println(result.toString());
        return result;
    }
}
