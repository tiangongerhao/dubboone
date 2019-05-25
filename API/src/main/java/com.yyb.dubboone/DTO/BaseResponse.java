package com.yyb.dubboone.DTO;

import com.yyb.dubboone.enums.StatusCode;

/**
 * @ClassName BaseResponse类
 * @Description 基础响应返回信息类
 * @Author yyb
 * @Date 2019/5/25 11:19
 * @Vsion 1.0
 **/
public class BaseResponse<T> {

    private Integer code;

    private String msg;

    private T data;


    public BaseResponse() {
    }


    public BaseResponse(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
