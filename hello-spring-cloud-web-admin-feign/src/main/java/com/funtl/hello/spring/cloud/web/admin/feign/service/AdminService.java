package com.funtl.hello.spring.cloud.web.admin.feign.service;

import com.funtl.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName AdminService
 * @Description
 * @Author chendapeng
 * @Date 2019/8/30
 **/
@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping("/hi")
    public String sayHi(@RequestParam("message") String message);
}
