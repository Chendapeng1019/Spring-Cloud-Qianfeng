package com.funtl.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AdminController
 * @Description
 * @Author chendapeng
 * @Date 2019/8/29
 **/
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String sayHi(@RequestParam("message") String message){
        return String.format("Hi, your meaasge is: %s i am from port: %s",message,port);
    }
}
