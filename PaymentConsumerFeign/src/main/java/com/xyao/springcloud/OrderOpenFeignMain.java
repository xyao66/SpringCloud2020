package com.xyao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/21 22:06
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableFeignClients  //激活openFeign
public class OrderOpenFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignMain.class,args);
    }
}
