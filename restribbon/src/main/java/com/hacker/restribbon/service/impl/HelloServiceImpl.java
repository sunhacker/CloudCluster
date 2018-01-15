package com.hacker.restribbon.service.impl;

import com.hacker.restribbon.service.IHelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @copyright (C), 2016-2018, 云南康村农业有限公司
 * @fileName: HelloServiceImpl
 * @author: Hacker
 * @email: dayi_lu@163.com
 * @date: 2018-01-14 14:59
 * @description: 测试服务实现
 * @version: 1.0.0
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-CLUSTER/test/sayhello?name="+name,String.class);
    }

    @Override
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
