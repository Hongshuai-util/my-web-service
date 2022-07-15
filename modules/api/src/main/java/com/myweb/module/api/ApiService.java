package com.myweb.module.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author chs
 * @date 2022/7/15 17:36
 * 接口模块启动类
 */
@Slf4j
@SpringBootApplication
public class ApiService {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ConfigurableApplicationContext context = SpringApplication.run(ApiService.class, args);
        log.info("api模块已启动 耗时：" + (System.currentTimeMillis() - start) + "毫秒");
    }
}
