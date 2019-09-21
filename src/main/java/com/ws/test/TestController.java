package com.ws.test;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.*;



/**
* @description: 测试
* @author:wangdy
* @create: 2019/8/22 下午8:57
**/
@RestController
@RequestMapping(value = "/test")
public class TestController {

    /**
     * @description:
     * @param
     * @return:
     * @author:
     * @Date: 2019/9/19 下午3:00
     */
    @GetMapping("/hi")
    public String hi(){
        return "eureka-client-2:8822";
    }


}
