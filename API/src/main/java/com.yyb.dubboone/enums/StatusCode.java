package com.yyb.dubboone.enums;

/**
 * @ClassName StatusCode类
 * @Description 基础响应信息枚举类
 * @Author yyb
 * @Date 2019/5/25 11:22
 * @Vsion 1.0
 **/
public enum StatusCode {

    SUCCESS(0,"成功"),
    FAIL(-1,"失败"),
    InvalidParams(200,"无效的参数"),
    ;


    private Integer code;

    private String msg;

    StatusCode() {
    }

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
