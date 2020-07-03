package com.xyao.springcloud.dao;

import com.xyao.springcloud.entity.CommonResult;
import com.xyao.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：xyao1
 * @date ：Created in 2020/5/17 16:28
 * @description：
 * @modified By：
 * @version: $
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPayment(@Param("serialNo") String serialNo);
}
