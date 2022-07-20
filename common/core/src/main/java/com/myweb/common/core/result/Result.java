package com.myweb.common.core.result;

import lombok.Data;

/**
 * @author chs
 * @date 2022/7/18 17:19
 * 相应实体类
 */
@Data
public class Result<T> {

    /** 相应码 */
    private Integer code;
    /** 提示信息 */
    private String message;
    /** 相应值 */
    private T data;

    public Result() {}

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result<Object> success(){
        Result<Object> result = new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage());
        return result;
    }

    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
        return result;
    }

    public static Result<Object> fail(String message){
        Result<Object> result = new Result<>(ResultEnum.FAIL.getCode(), message, null);
        return result;
    }

    public static Result<Object> error(){
        Result<Object> result = new Result<>(ResultEnum.ERROR.getCode(), ResultEnum.ERROR.getMessage(), null);
        return result;
    }
}
