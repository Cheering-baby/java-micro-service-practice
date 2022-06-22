package com.service.consumer.controller;

import com.service.common.common.CommonResult;
import com.service.common.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author daizhihong
 * @create 2022/6/18 22:03
 **/

@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://PAYMENT-SERIVCE";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/payment/get")
    public CommonResult get(@RequestParam Long id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        log.info("params: {}", params);
        CommonResult result = restTemplate.getForObject(PAYMENT_URL + "/payment/get?id={id}", CommonResult.class, params);
        System.out.println(result.toString());
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get?id={id}", CommonResult.class, params);
    }

}
