package com.hacker.feign.controller;

import com.hacker.feign.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @copyright (C), 2016-2018, 云南康村农业有限公司
 * @fileName: HelloController
 * @author: Hacker
 * @email: dayi_lu@163.com
 * @date: 2018-01-14 15:15
 * @description: 测试控制器
 * @version: 1.0.0
 */
@RestController
public class HelloController {
    @Autowired
    private TestFeign testFeign;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return testFeign.sayHiFromClientOne(name);
    }
}
