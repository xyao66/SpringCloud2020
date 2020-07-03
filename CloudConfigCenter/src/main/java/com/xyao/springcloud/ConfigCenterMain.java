package com.xyao.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/31 8:44
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableConfigServer //配置中心服务标识
public class ConfigCenterMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain.class,args);
    }
}
