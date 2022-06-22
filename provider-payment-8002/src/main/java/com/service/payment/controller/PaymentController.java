package com.service.payment.controller;

import com.service.common.common.CommonResult;
import com.service.common.entity.Payment;
import com.service.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author daizhihong
 * @create 2022/6/18 4:11
 **/

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if(result > 0) {
            log.info("插入数据库成功: 端口号{}", serverPort);
            return CommonResult.success(result);
        }
        return CommonResult.failed();
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public CommonResult getPaymentById(@RequestParam Long id) {
        log.info("id: {}", id);
        Payment payment = paymentService.getPaymentById(id);
        return CommonResult.success(payment);
    }
}
