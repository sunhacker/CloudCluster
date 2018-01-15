package com.hacker.feign.feign;

import com.hacker.feign.hihystric.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @copyright (C), 2016-2018, 云南康村农业有限公司
 * @fileName: TestFeign
 * @author: Hacker
 * @email: dayi_lu@163.com
 * @date: 2018-01-14 15:14
 * @description: Feign测试
 * @version: 1.0.0
 */
@FeignClient(value = "service-cluster",fallback = SchedualServiceHiHystric.class)
public interface TestFeign {

    @RequestMapping(value = "/test/sayhello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
