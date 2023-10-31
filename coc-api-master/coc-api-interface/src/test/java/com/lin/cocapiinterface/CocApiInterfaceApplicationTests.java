package com.lin.cocapiinterface;

import com.lin.cocclientsdk.client.CocApiClient;
import com.lin.cocclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CocApiInterfaceApplicationTests {

    @Resource
    private CocApiClient cocApiClient;

    @Test
    void contextLoads() {
        String result = cocApiClient.getNameByGet("linyk");
        User user = new User();
        user.setUsername("linyk");
        String usernameByPost = cocApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
