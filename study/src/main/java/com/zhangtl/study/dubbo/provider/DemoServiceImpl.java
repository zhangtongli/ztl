package com.zhangtl.study.dubbo.provider;

import com.zhangtl.study.dubbo.DemoService;


public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}