/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2022 All Rights Reserved.
 */
package com.alibaba.shuaishuai.controller;

import java.util.Date;

import com.alibaba.shuaishuai.DO.User;
import com.alibaba.shuaishuai.service.UpdateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author linYue
 * @version UpdateController.java, v 0.1 2022年08月14日 10:24 PM linYue Exp $
 */
@Controller
public class UpdateController {

    @Autowired
    UpdateService updateService;

    @RequestMapping("/update/{id}")
    @ResponseBody
    public void update(@PathVariable(value = "id") Integer id){

        User user = new User();
        user.setAge(99);
        user.setName(null);
        Date date = new Date(2020-1900, 9-1, 28);
        user.setTime(date);

        updateService.updateById(id, user);



    }
}