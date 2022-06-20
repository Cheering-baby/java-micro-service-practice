package com.service.payment.service.impl;

import com.service.common.entity.Payment;
import com.service.payment.dao.PaymentDao;
import com.service.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author daizhihong
 * @create 2022/6/18 4:08
 **/

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
