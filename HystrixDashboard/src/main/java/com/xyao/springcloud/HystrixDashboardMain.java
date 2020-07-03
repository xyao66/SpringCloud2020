package com.xyao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/26 15:53
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableHystrixDashboard //开启Hystrix dashboard 仪表盘
public class HystrixDashboardMain {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain.class,args);
    }

}
