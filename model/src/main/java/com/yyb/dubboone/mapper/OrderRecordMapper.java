package com.yyb.dubboone.mapper;

import com.yyb.dubboone.model.OrderRecord;

/**
 * @Author yyb
 * @Description 订单DAO接口
 * @Date 2019/5/25
 * @Param
 * @return
 **/
public interface OrderRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderRecord record);

    int insertSelective(OrderRecord record);

    OrderRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderRecord record);

    int updateByPrimaryKey(OrderRecord record);
}
