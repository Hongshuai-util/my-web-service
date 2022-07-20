package com.myweb.common.service.config;

import com.myweb.common.core.exception.ServiceException;
import com.myweb.common.core.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author chs
 * @date 2022/7/18 18:24
 * 全局异常处理器
 * 由于springBoot项目再启动时只会扫描启动文件所在的目录下的类，无法扫描到这个类导致无法加载
 * 可以将此类地址配置再META-INF下的spring.factories文件中，这样即使扫描路径不同也会加载此类
 * 因为springBoot项目再启动时会加载META-INF下的spring.factories文件中
 * org.springframework.boot.autoconfigure.EnableAutoConfiguration所指定的类
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 自定义系统异常处理器
     * @param e
     * @return
     */
    @ExceptionHandler(value = ServiceException.class)
    public Result<Object> serviceExceptionHandler(ServiceException e){
        Result<Object> fail = Result.fail(e.getMessage());
        return fail;
    }

    /**
     * 系统异常处理器
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Result<Object> exceptionHandler(Exception e){
        Result<Object> error = Result.error();
        return error;
    }
}
