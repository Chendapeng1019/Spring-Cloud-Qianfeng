package com.funtl.hello.spring.cloud.web.admin.feign.controller;

import com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AdminController
 * @Description
 * @Author chendapeng
 * @Date 2019/8/30
 **/
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String message){
        return adminService.sayHi(message);
    }
}
