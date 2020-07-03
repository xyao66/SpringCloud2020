package com.xyao.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/31 9:48
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator myRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("myRoute",
                r -> r.path("/baidu").uri("http://www.baidu.com")).build();
        return routes.build();
    }

}
