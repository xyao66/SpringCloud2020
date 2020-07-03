package com.xyao.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/26 10:12
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(String id) {
        return "这是通过feignclient注解里面的fallback来实现的服务降级——OK";
    }

    @Override
    public String paymentInfo_TimeOut(String id) {
        return "这是通过feignclient注解里面的fallback来实现的服务降级——TimeOut";
    }

    @Override
    public String paymentCircuitBreaker(Integer id) {
        return "服务熔断，暂时未启用！";
    }
}
