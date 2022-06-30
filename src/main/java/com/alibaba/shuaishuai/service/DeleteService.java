package com.alibaba.shuaishuai.service;

import com.alibaba.shuaishuai.dao.DeleteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ShuaiYu_Jia
 * @Data: 2022/7/1
 * @Description:
 */

@Service
public class DeleteService {

    @Autowired
    DeleteDao deleteDao;

    public String del(String str){

        deleteDao.delete(str);

        return  "ok";



    }
}
