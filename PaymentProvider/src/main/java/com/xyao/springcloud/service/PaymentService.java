package com.xyao.springcloud.service;

import com.xyao.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/17 16:43
 * @description：
 * @modified By：
 * @version: $
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPayment(@Param("serialNo") String serialNo);
}
