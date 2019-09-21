package com.ws.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @program: eureka-client
 * @description:
 * @author: zxb
 * @create: 2019-08-27 12:21
 **/
@FeignClient("eureka-client")
public interface TestService {
    @RequestMapping(value = "/test/hi", method = RequestMethod.GET)
    String hi();
}
