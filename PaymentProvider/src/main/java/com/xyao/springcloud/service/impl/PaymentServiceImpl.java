package com.xyao.springcloud.service.impl;

import com.xyao.springcloud.dao.PaymentDao;
import com.xyao.springcloud.entity.Payment;
import com.xyao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/17 16:44
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPayment(String serialNo) {
        return paymentDao.getPayment(serialNo);
    }
}
