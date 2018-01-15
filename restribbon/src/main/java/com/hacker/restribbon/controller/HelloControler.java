package com.hacker.restribbon.controller;

import com.hacker.restribbon.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @copyright (C), 2016-2018, 云南康村农业有限公司
 * @fileName: HelloControler
 * @author: Hacker
 * @email: dayi_lu@163.com
 * @date: 2018-01-14 15:02
 * @description: 测试控制器
 * @version: 1.0.0
 */
@RestController
public class HelloControler {

    @Autowired
    IHelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

}
