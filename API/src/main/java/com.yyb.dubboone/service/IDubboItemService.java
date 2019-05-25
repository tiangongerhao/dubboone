package com.yyb.dubboone.service;

import com.yyb.dubboone.DTO.BaseResponse;

/**
 * @Author yyb
 * @Description dubbo的面向接口编程 API接口发布出去
 * @Date 2019/5/25
 * @Param
 * @return
 **/
public interface IDubboItemService {

    BaseResponse listItems();

    BaseResponse listPageItems(Integer pageNo,Integer pageSize);

    BaseResponse listPageItemsParams(Integer pageNo,Integer pageSize,String search);


}
