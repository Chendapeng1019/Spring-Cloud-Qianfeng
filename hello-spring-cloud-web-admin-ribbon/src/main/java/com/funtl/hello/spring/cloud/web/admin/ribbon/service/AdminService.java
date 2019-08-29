package com.funtl.hello.spring.cloud.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName AdminService
 * @Description
 * @Author chendapeng
 * @Date 2019/8/30
 **/
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String message){
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message="+
                 message, String.class);
    }
}
