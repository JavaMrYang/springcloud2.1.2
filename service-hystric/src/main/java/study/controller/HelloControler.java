package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.service.SchedualServiceHi;

/**
 * @Author LiuYang
 * @Date 2019/5/31/031  16:50
 * @Version 1.0
 **/
@RestController
public class HelloControler {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
