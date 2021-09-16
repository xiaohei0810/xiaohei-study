package com.xiaohei.springcloudnacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/15 10:53 上午
 * @Version 1.0
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class NacosConfigController {

//    @Value("${useLocalCache}")
//    private Boolean useLocalCache;

    @Value("${example}")
    private String example;

    @Value("${test}")
    private String test;

//    @Value("${example.test}")
//    private String exampleTest;

//    @Value("${common.config1}")
//    private String example;

    @RequestMapping("/get")
    public String getConfig(){
        System.out.println(example);
        System.out.println(test);
        return example;
    }
//
//    @RequestMapping("/get1")
//    public String getConfig1(){
//        System.out.println(value);
//        return value;
//    }


}
