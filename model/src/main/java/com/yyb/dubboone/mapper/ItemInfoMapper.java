package com.yyb.dubboone.mapper;

import com.yyb.dubboone.model.ItemInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author yyb
 * @Description 商品信息dao层接口
 * @Date 2019/5/25
 * @Param
 * @return
 **/
public interface ItemInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(ItemInfo record);

    int insertSelective(ItemInfo record);

    ItemInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemInfo record);

    int updateByPrimaryKey(ItemInfo record);

    List<ItemInfo> selectAll();

    List<ItemInfo> selectAllByParams(@Param("search") String search);


}
