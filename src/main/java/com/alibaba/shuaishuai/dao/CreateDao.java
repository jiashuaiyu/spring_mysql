package com.alibaba.shuaishuai.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: ShuaiYu_Jia
 * @Data: 2022/6/12
 * @Description:
 */

@Mapper
public interface CreateDao {
    void insert(String data);
}
