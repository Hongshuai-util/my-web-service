package com.myweb.common.core.result;

/**
 * @author chs
 * @date 2022/7/18 17:23
 */
public enum ResultEnum {

    SUCCESS(200, "操作成功"),
    FAIL(400, "操作失败"),
    ERROR(500, "系统异常,请稍后再试");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
