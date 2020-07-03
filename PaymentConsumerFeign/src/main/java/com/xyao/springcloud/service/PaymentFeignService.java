package com.xyao.springcloud.service;

import com.xyao.springcloud.entity.CommonResult;
import com.xyao.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "PAYMENT-SERVICE") //feign使用于客户端 这里配置的名称为Eureka 里面注册的服务提供方的名称
public interface PaymentFeignService {

    /*@PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment);*/

    @GetMapping(value = "/payment/get/{serialNo}")
    public CommonResult getPayment(@PathVariable("serialNo") String serialNo);
}
