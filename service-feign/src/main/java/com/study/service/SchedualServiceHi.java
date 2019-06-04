package com.study.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author LiuYang
 * @Date 2019/5/31/031  17:02
 * @Version 1.0
 **/
@FeignClient("EUREKA-CLIENT")
public interface SchedualServiceHi {
    /**
     * 调用eureka-client模块
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
