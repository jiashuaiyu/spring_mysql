/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2022 All Rights Reserved.
 */
package com.alibaba.shuaishuai.service;

import com.alibaba.shuaishuai.dao.UserMapper;
import com.alibaba.shuaishuai.DO.User;
import com.alibaba.shuaishuai.DO.UserExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linYue
 * @version UpdateService.java, v 0.1 2022年08月14日 10:25 PM linYue Exp $
 */

@Service
public class UpdateService {

    @Autowired
    UserMapper userMapper;

    public void updateById(Integer id, User user){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(id);
        userMapper.updateByExampleSelective(user, userExample);
    }
}