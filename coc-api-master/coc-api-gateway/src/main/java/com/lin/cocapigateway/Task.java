package com.lin.cocapigateway;

import com.lin.cocapibackend.provider.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class Task {
    @DubboReference
    private DemoService demoService;

    public void test(){
        String result = demoService.sayHello("world");
        System.out.println("Receive result ======> " + result);
    }
}
