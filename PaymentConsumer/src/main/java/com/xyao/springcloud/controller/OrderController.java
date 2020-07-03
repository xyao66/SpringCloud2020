package com.xyao.springcloud.controller;

import com.xyao.springcloud.entity.CommonResult;
import com.xyao.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/17 17:56
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@Slf4j
public class OrderController {

    public static final String url = "http://PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    //
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(url + "/payment/create", payment , CommonResult.class);
    }

    @GetMapping("consumer/payment/get/{serialNo}")
    public CommonResult<Payment> getPayment(@PathVariable("serialNo") String serialNo){
        return restTemplate.getForObject(url+"/payment/get/" + serialNo,CommonResult.class);
    }
}
