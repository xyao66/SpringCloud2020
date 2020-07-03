package com.xyao.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/31 16:39
 * @description：
 * @modified By：
 * @version: $
 */
@Component
@Slf4j
public class MyGateWayFilter implements GlobalFilter, Ordered {
    /**
     *
     * @param exchange Spring5.0以后的写法，类似于severlet的request
     * @param chain
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("======这是一个自定义的过滤器=====");
        String userName = exchange.getRequest().getQueryParams().getFirst("userName");
        if("".equals(userName) || userName == null){
            //如果参数没有传递userName 将拒绝该请求
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        //过滤器继续传递
        return chain.filter(exchange);
    }

    /**
     * 过滤器加载顺序，值越小优先级越高
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
