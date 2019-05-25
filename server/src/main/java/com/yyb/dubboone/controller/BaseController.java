package com.yyb.dubboone.controller;

import com.yyb.dubboone.DTO.BaseResponse;
import com.yyb.dubboone.enums.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BaseController类
 * @Description TODO
 * @Author yyb
 * @Date 2019/5/25 13:50
 * @Vsion 1.0
 **/
@RestController
public class BaseController {

    private static Logger logger = LoggerFactory.getLogger(BaseController.class);

    private static final String prefix = "base";

    /**
     * @Author yyb
     * @Description 测试第一个hello world！
     * @Date 2019/5/25
     * @Param [param]
     * @return com.yyb.dubboone.DTO.BaseResponse
     **/
    @RequestMapping(value = prefix+"/one",method = RequestMethod.GET)
    public BaseResponse one(@RequestParam String param){

        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        logger.info("前端传入的数据为："+param);

        baseResponse.setData(param);
        return baseResponse;

    }




}



