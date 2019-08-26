package com.ws.test;

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
     * @Description: 获取名称
     * @return:
     * @author:wangdy
     * @Date: 2019/8/22 下午8:58
    */
    @GetMapping("/names")
    public String getNames(){
        String names = "张三、李四、王五、赵六";
        return names;
    }


}
