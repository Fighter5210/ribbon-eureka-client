package com.ws.test;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


/**
* @description: 测试
* @author:wangdy
* @create: 2019/8/22 下午8:57
**/
@RestController
@RequestMapping(value = "/test")
public class TestController {

    /**
     * @Description: 获取名称
     * @return:
     * @author:wangdy
     * @Date: 2019/8/22 下午8:58
    */
    @GetMapping("/randoms")
    public String getRandom(){
        String random = "随机数："+RandomUtils.nextInt();
        return random;
    }


}
