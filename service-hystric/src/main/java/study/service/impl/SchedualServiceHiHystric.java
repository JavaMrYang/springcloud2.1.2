package study.service.impl;

import org.springframework.stereotype.Component;
import study.service.SchedualServiceHi;

/**
 * @Author LiuYang
 * @Date 2019/5/31/031  17:14
 * @Version 1.0
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
