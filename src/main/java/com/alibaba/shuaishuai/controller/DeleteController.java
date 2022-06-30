package com.alibaba.shuaishuai.controller;

import com.alibaba.shuaishuai.service.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: ShuaiYu_Jia
 * @Data: 2022/7/1
 * @Description:
 */
@Controller
public class DeleteController {

    @Autowired
    DeleteService deleteService;

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(String str2){

        String result = deleteService.del(str2);
        if (result.equals("ok")){
            return "成功";
        }else {
            return "失败"+result.toString();
        }

    }

}
