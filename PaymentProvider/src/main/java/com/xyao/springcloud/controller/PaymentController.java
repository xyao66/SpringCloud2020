package com.xyao.springcloud.controller;

import com.xyao.springcloud.entity.CommonResult;
import com.xyao.springcloud.entity.Payment;
import com.xyao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/17 16:46
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@Slf4j
@RefreshScope
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    //测试配置中心读取配置的文件内容
    @Value("${config.info}")
    private String configInfo;

    @Resource
    private DiscoveryClient discoveryClient;//服务注册与发现，用它来获取服务信息

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*************数据插入结果：" + result);
        if (result>0){  //成功
            return new CommonResult("200","插入数据库成功",result);
        }else {
            return new CommonResult("444","插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{serialNo}")
    public CommonResult getPayment(@PathVariable("serialNo") String serialNo){
        Payment payment = paymentService.getPayment(serialNo);
        if (payment!=null){  //说明有数据，能查询成功
            return new CommonResult("200","查询成功,调用服务器端口为："+serverPort,payment);
        }else {
            return new CommonResult("444","没有对应记录，查询ID："+serialNo,null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("*****************" + service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t"
                    + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/configinfo")
    public String getConfigInfo(){
        log.info("获取配置中心的配置内容");
        return configInfo;
    }

}
