package com.xyao.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/25 11:01
 * @description：
 * @modified By：
 * @version: $
 */
@Component
//使用feign来实现hystrix的降级，处理原先的代码膨胀问题
//@FeignClient(value="PAYMENT-HYSTRIX-PROVIDER",fallback = PaymentFallbackService.class)
@FeignClient(value="PAYMENT-HYSTRIX-PROVIDER")
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") String id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") String id);

    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
