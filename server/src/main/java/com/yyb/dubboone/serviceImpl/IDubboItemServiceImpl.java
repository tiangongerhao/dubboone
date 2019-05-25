package com.yyb.dubboone.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yyb.dubboone.DTO.BaseResponse;
import com.yyb.dubboone.enums.StatusCode;
import com.yyb.dubboone.mapper.ItemInfoMapper;
import com.yyb.dubboone.model.ItemInfo;
import com.yyb.dubboone.service.IDubboItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * @ClassName IDubboItemService类
 * @Description dubbo服务实现类 service注解使用dubbo注解，不使用spring注解
 * @Author yyb
 * @Date 2019/5/25 15:58
 * @Vsion 1.0
 **/
@Service(protocol = {"dubbo","rest"},validation = "true",version = "1.0",timeout = 3000)
@Path("moocOne")
public class IDubboItemServiceImpl implements IDubboItemService {

    private final static Logger logger = LoggerFactory.getLogger(IDubboItemServiceImpl.class);

    @Autowired
    private ItemInfoMapper itemInfoMapper;


    /**
     * @Author yyb
     * @Description 列表查询服务的实际逻辑
     * @Date 2019/5/25
     * @Param []
     * @return com.yyb.dubboone.DTO.BaseResponse
     **/
//    @Override
    @Path("list/items")
    public BaseResponse listItems() {

        BaseResponse response = new BaseResponse(StatusCode.SUCCESS);

        try {

            List<ItemInfo> infos = itemInfoMapper.selectAll();
            logger.info("查询到的商品信息数据为：{}"+infos);
            response.setData(infos);

        }catch (Exception e){

            logger.info("商品列表信息查询异常");
            return new BaseResponse(StatusCode.FAIL);
        }
        return response;

    }


    /**
     * @Author yyb
     * @Description 列表查询-分页查询
     * @Date 2019/5/25
     * @Param [pageNo, PageSize]
     * @return com.yyb.dubboone.DTO.BaseResponse
     **/
    @Path("item/page/list")
    public BaseResponse listPageItems(@QueryParam("pageNo") Integer pageNo,
                                      @QueryParam("PageSize") Integer PageSize) {
        BaseResponse response=new BaseResponse(StatusCode.SUCCESS);
        try {
            //TODO:分页组件-第pageNo页，pageSize条数目数据
            PageHelper.startPage(pageNo,PageSize);
            PageInfo info=new PageInfo<ItemInfo>(itemInfoMapper.selectAll());
            response.setData(info);

        }catch (Exception e){
            logger.error("列表查询-分页查询服务-实际的业务实现逻辑-发生异常：",e.fillInStackTrace());
            response=new BaseResponse(StatusCode.FAIL);
        }
        return response;
    }

    /**
     * @Author yyb
     * @Description 列表查询-分页查询-模糊查询
     * @Date 2019/5/25
     * @Param [pageNo, PageSize, search]
     * @return com.yyb.dubboone.DTO.BaseResponse
     **/
    @Path("item/page/list/params")
    public BaseResponse listPageItemsParams(@QueryParam("pageNo") Integer pageNo,
                                            @QueryParam("PageSize") Integer PageSize,
                                            @QueryParam("search") String search) {
        BaseResponse response=new BaseResponse(StatusCode.SUCCESS);
        try {
            //TODO:分页组件-第pageNo页，pageSize条数目数据
            PageHelper.startPage(pageNo,PageSize);
            PageInfo info=new PageInfo<ItemInfo>(itemInfoMapper.selectAllByParams(search));
            response.setData(info);

        }catch (Exception e){
            logger.error("列表查询-分页查询模糊查询服务-实际的业务实现逻辑-发生异常：",e.fillInStackTrace());
            response=new BaseResponse(StatusCode.FAIL);
        }
        return response;
    }







}
