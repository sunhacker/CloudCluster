package com.hacker.serviceone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @copyright (C), 2016-2018, 云南康村农业有限公司
 * @fileName: IndexConreoller
 * @author: Hacker
 * @email: dayi_lu@163.com
 * @date: 2018-01-14 10:40
 * @description: 主入口控制器
 * @version: 1.0.0
 */

@Controller
@RequestMapping(value = {"","/","/index","/home"})
public class IndexConreoller {

    @ResponseBody
    @RequestMapping(value = {"","/","/index","/home"})
    public String index(){
        return "hello";
    }
}
