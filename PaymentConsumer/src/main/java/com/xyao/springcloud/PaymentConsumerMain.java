package com.xyao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/17 17:51
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaClient //允许被注册中心发现
public class PaymentConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsumerMain.class,args);
    }

}
