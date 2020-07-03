package com.xyao.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/21 22:32
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        /**
         * NONE 默认的，不显示任何日志
         * BASIC 仅记录请求方法、URL、响应状态码及执行时间
         * HEADERS 除了BASIC中定义的以外，还有请求和响应头的信息
         * FULL 除上以外，还有请求和响应的正文及元数据
         */
        return Logger.Level.FULL;
    }
}
