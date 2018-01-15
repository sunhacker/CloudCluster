package com.hacker.serviceone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @copyright (C), 2016-2018, 云南康村农业有限公司
 * @fileName: TestController
 * @author: Hacker
 * @email: dayi_lu@163.com
 * @date: 2018-01-14 14:05
 * @description: 测试控制器
 * @version: 1.0.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    private String port;
    @RequestMapping("/sayhello")
    public String sayHello(@RequestParam("name")String name){
        return "hello"+name+port;
    }
}
