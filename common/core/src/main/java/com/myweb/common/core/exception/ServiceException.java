package com.myweb.common.core.exception;

/**
 * @author chs
 * @date 2022/7/18 17:41
 */
public class ServiceException extends RuntimeException{

    public ServiceException(){}

    public ServiceException(String message){
        super(message);
    }

}
