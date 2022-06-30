package com.alibaba.shuaishuai.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: ShuaiYu_Jia
 * @Data: 2022/7/1
 * @Description:
 */

@Mapper
public interface DeleteDao {
    void delete(String str);
}
