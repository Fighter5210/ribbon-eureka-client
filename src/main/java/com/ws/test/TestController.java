package com.ws.test;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
* @description: 测试
* @author:wangdy
* @create: 2019/8/22 下午8:57
**/
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Resource
    private LoadBalancerClient loadBalancer;

    @Resource
    RestTemplate restTemplate;

    @Resource
    TestService restService;

    /**
     * @description:hi
     * @return:
     * @author:
     * @Date: 2019/9/21 下午3:27
    */
    @GetMapping("/testRibbon")
    public String testRibbon(){
        String data = restTemplate.getForObject("http://eureka-client/test/hi",String.class);
        return data;
    }
    /**
     * @Description: hi
     * @return:
     * @author:wangdy
     * @Date: 2019/9/21 下午3:27
    */
    @GetMapping("/testRibbon2")
    public String testRibbon2(){
        ServiceInstance instance = loadBalancer.choose("eureka-client");
        return instance.getHost()+":"+instance.getPort();
    }
    /**
     * @Description: hi
     * @return:
     * @author:wangdy
     * @Date: 2019/9/21 下午3:27
    */
    @GetMapping("/testRibbon3")
    public String testRibbon3(){
        String hi = restService.hi();
        return hi;
    }


}
