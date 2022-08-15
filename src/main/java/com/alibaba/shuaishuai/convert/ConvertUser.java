/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2022 All Rights Reserved.
 */
package com.alibaba.shuaishuai.convert;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.shuaishuai.model.UserVO;
import com.alibaba.shuaishuai.DO.User;

/**
 * @author linYue
 * @version ConvertUser.java, v 0.1 2022年08月14日 9:08 PM linYue Exp $
 */
public class ConvertUser {
    public static List<UserVO> convert(List<User> userList){
        List<UserVO> userVOList = new ArrayList<>();

        for (User user : userList){
            UserVO userVO = new UserVO();
            userVO.setName(user.getName());
            userVO.setAge(user.getAge());
            userVOList.add(userVO);
        }

        return userVOList;
    }
}