package com.xyao.springcloud.controller;

import com.xyao.springcloud.entity.CommonResult;
import com.xyao.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/21 22:16
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{serialNo}")
    public CommonResult getPayment(@PathVariable("serialNo") String serialNo){
        return paymentFeignService.getPayment(serialNo);
    }
}
