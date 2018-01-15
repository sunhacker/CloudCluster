package com.hacker.feign.hihystric;

import com.hacker.feign.feign.TestFeign;
import org.springframework.stereotype.Component;

/**
 * @copyright (C), 2016-2018, 云南康村农业有限公司
 * @fileName: SchedualServiceHiHystric
 * @author: Hacker
 * @email: dayi_lu@163.com
 * @date: 2018-01-14 15:30
 * @description:
 * @version: 1.0.0
 */
@Component
public class SchedualServiceHiHystric implements TestFeign {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}