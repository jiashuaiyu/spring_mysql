/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2022 All Rights Reserved.
 */
package com.alibaba.shuaishuai.convert;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.shuaishuai.DO.Adress;
import com.alibaba.shuaishuai.DO.User;
import com.alibaba.shuaishuai.model.TwoAdressVO;

/**
 * @author linYue
 * @version ConvertAdressVO.java, v 0.1 2022年08月15日 2:54 PM linYue Exp $
 */
public class ConvertAdressVO {

    public static TwoAdressVO convert(User user, List<Adress> adressList){
        TwoAdressVO twoAdressVO = new TwoAdressVO();
        twoAdressVO.setName(user.getName());
        twoAdressVO.setTime(user.getTime());
        twoAdressVO.setAge(user.getAge());

        List<String> companyList = new ArrayList<>();
        List<String> homeList = new ArrayList<>();
        for (Adress adress : adressList){
            companyList.add(adress.getCompany());
            homeList.add(adress.getHome());
        }
        twoAdressVO.setCompanyList(companyList);
        twoAdressVO.setHomeList(homeList);
        return twoAdressVO;
    }
}