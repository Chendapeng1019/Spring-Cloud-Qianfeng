package com.funtl.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @ClassName AdminServiceHystrix
 * @Description
 * @Author chendapeng
 * @Date 2019/8/30
 **/
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
