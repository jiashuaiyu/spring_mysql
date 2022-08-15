/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2022 All Rights Reserved.
 */
package com.alibaba.shuaishuai.service;

import java.util.List;

import com.alibaba.shuaishuai.DO.Adress;
import com.alibaba.shuaishuai.DO.AdressExample;
import com.alibaba.shuaishuai.convert.ConvertAdressVO;
import com.alibaba.shuaishuai.convert.ConvertUser;
import com.alibaba.shuaishuai.dao.AdressDAO;
import com.alibaba.shuaishuai.dao.UserMapper;
import com.alibaba.shuaishuai.model.TwoAdressVO;
import com.alibaba.shuaishuai.model.UserVO;
import com.alibaba.shuaishuai.DO.User;
import com.alibaba.shuaishuai.DO.UserExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linYue
 * @version SelectService.java, v 0.1 2022年08月14日 8:37 PM linYue Exp $
 */

@Service
public class SelectService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    AdressDAO adressDAO;

    private Integer pp;

    public User selectById(Integer id){
        pp = 1;
        User user = userMapper.selectByPrimaryKey(id);

        return user;
    }


    public List<UserVO> selectByAge(Integer age){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andAgeGreaterThan(age);
        List<User> userList = userMapper.selectByExample(userExample);

        return ConvertUser.convert(userList);
    }

    public TwoAdressVO selectAdressById(Integer id){

        User user = userMapper.selectByPrimaryKey(id);
        AdressExample adressExample = new AdressExample();
        adressExample.createCriteria().andNameEqualTo(user.getName());
        List<Adress> adressList = adressDAO.selectByExample(adressExample);

        TwoAdressVO twoAdressVO = ConvertAdressVO.convert(user, adressList);

        return twoAdressVO;
    }
}