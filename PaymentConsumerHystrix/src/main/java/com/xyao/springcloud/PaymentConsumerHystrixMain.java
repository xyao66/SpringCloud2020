package com.xyao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/25 10:47
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix //调用端（消费端的熔断启动 结合yml的feign.hystrix.enabled）
public class PaymentConsumerHystrixMain {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsumerHystrixMain.class,args);
    }
}
