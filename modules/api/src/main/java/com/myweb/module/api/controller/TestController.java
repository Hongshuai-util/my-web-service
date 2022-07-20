package com.myweb.module.api.controller;

import com.myweb.common.core.exception.ServiceException;
import com.myweb.common.core.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chs
 * @date 2022/7/18 17:01
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/hello")
    public Result<String> hello(Integer a){
        int i = 6/a;
        if(i == 1){
            throw new ServiceException("i = 1");
        }
        Result<String> success = Result.success("hello");
        return success;
    }
}
