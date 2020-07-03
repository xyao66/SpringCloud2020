package com.xyao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/26 16:30
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GateWayMain {

    public static void main(String[] args) {
        SpringApplication.run(GateWayMain.class,args);
    }


}
