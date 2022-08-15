package com.alibaba.shuaishuai.service;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.shuaishuai.dao.CreateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ShuaiYu_Jia
 * @Data: 2022/6/12
 * @Description:
 */

@Service
public class CreateService {

    @Autowired
    CreateDao createDao;

    public String addData(String postJson){

        JSONObject jsonpObject = JSONObject.parseObject(postJson);
        String data = jsonpObject.getString("data");
        int num = jsonpObject.getIntValue("num");

        System.out.println("service is num = "+ num);


        try {
//            System.out.println(data+" "+num);
            createDao.insert(data, num);
        } catch (Exception e) {
            System.out.println("error:"+e.getStackTrace());
            return "error:"+e.getStackTrace();
        }

        return "ok";

    }
}
