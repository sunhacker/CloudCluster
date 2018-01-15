package com.hacker.restribbon.service;

/**
 * @copyright (C), 2016-2018, 云南康村农业有限公司
 * @fileName: IHelloService
 * @author: Hacker
 * @email: dayi_lu@163.com
 * @date: 2018-01-14 15:00
 * @description: 测试服务接口
 * @version: 1.0.0
 */
public interface IHelloService {
    public String hiService(String name);

    public String hiError(String name);
}
