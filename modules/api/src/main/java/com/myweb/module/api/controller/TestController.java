package com.myweb.module.api.controller;

import com.myweb.common.core.exception.ServiceException;
import com.myweb.common.core.result.Result;
import com.myweb.common.core.util.Assert;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chs
 * @date 2022/7/18 17:01
 */
@Slf4j
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/hello")
    public Result<String> hello(Integer a){
        Assert.isEmpty(a);
        int i = 6/a;
        if(i == 1){
            throw new ServiceException("i = 1");
        }
        Result<String> success = Result.success("hello");
        log.error("asdk");
        log.info("asdk");
        log.debug("asdk");
        log.info("asdk");
        return success;

    }

    public static void main(String[] args) {
        log.error("asdk");
        log.info("asdk");
        log.debug("asdk");
        log.info("asdk");
    }
}
