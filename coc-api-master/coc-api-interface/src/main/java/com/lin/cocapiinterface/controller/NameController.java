package com.lin.cocapiinterface.controller;

import com.lin.cocclientsdk.model.User;
import com.lin.cocclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称 API
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name){

        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//        // todo 实际情况应该是去数据库中查是否已分配给用户
//        if( !accessKey.equals("linyk") ){
//            throw new RuntimeException("无权限");
//        }
//        if (Long.parseLong(nonce) > 100000){
//            throw new RuntimeException("无权限");
//        }
//        // todo 时间和当前时间不能超过5分钟
//        if ((System.currentTimeMillis() / 1000 - Long.parseLong(timestamp)) > 300){
//            throw new RuntimeException("无权限");
//        }
//        // todo 实际情况应该是去数据库中查出secretKey
//        String serverSign = SignUtils.getSign(body, "abcdefg");
//        if (!sign.equals(serverSign)){
//            throw new RuntimeException("无权限");
//        }

        String result =  "POST 你的名字是" + user.getUsername();

        return result;
    }
}
