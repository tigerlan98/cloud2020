package com.lh.springcloud.dao;

import com.lh.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lanhu
 * @create 2020-04-08 19:42
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id")Long id);
}
