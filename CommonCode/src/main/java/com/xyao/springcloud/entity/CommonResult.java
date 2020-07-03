package com.xyao.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/17 16:21
 * @description：
 * @modified By：
 * @version: $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{

    private String code;//状态码值
    private String message;//状态描述
    private T data;//返回数据

    public CommonResult(String code,String message){
        this(code,message,null);
    }
}
