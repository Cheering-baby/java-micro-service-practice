package com.service.payment.service;

import com.service.common.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author daizhihong
 * @create 2022/6/18 4:07
 **/

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
