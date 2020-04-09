package com.lh.springcloud.service;

import com.lh.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lanhu
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id")Long id);
}
