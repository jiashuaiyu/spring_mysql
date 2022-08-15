/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2022 All Rights Reserved.
 */
package com.alibaba.shuaishuai.controller;

import java.util.List;

import com.alibaba.shuaishuai.model.TwoAdressVO;
import com.alibaba.shuaishuai.model.UserVO;
import com.alibaba.shuaishuai.DO.User;
import com.alibaba.shuaishuai.service.SelectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author linYue
 * @version SelectController.java, v 0.1 2022年08月14日 8:42 PM linYue Exp $
 */
@Controller
public class SelectController {

    @Autowired
    SelectService selectService;

    @RequestMapping("/selectbyid/{id}")
    @ResponseBody
    public User selectById(@PathVariable("id") Integer id){
        return selectService.selectById(id);
    }


    @RequestMapping("/selectbyage/{age}")
    @ResponseBody
    public List<UserVO> selectByAge(@PathVariable("age") Integer age){
        return selectService.selectByAge(age);
    }

    @RequestMapping("/selectAdressById/{id}")
    @ResponseBody
    public TwoAdressVO selectAdressById(@PathVariable("id") Integer id){
        return selectService.selectAdressById(id);

    }


}