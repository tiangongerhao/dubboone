package com.yyb.dubboone.model;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName OrderRecord类
 * @Description 订单信息实体类
 * @Author yyb
 * @Date 2019/5/25 15:44
 * @Vsion 1.0
 **/
@Data
public class OrderRecord {

    private Integer id;

    private Integer itemId;

    private Integer total;

    private String customerName;

    private Date orderTime;

    private Integer isActive;

    private Date updateTime;

}
