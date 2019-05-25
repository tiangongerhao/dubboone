package com.yyb.dubboone.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ItemInfo类
 * @Description 商品信息类
 * @Author yyb
 * @Date 2019/5/25 15:43
 * @Vsion 1.0
 **/
@ToString
@Data
public class ItemInfo implements Serializable {

    private Integer id;

    private String code;

    private String name;

    private BigDecimal price;

    private Integer isActive;

    private Date createTime;

    private Date updateTime;

}
