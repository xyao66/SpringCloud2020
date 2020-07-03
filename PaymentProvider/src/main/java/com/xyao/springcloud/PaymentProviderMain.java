package com.xyao.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/17 16:10
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentProviderMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderMain.class,args);
    }
}
