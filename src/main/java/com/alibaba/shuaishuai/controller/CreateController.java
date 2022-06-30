package com.alibaba.shuaishuai.controller;

import com.alibaba.shuaishuai.service.CreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: ShuaiYu_Jia
 * @Data: 2022/6/12
 * @Description:
 */
@Controller
public class CreateController {

    @Autowired
    public CreateService createService;

    @PostMapping("/create")
    @ResponseBody
    public String create(@RequestBody String postJson){
        System.out.println(postJson);

        String result = createService.addData(postJson);

        if(result.equals("ok")){
            return "添加成功";
        }else {
            return result;
        }
    }
}
