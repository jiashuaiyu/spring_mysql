package com.alibaba.shuaishuai.controller;

import javax.annotation.Resource;

import com.alibaba.shuaishuai.ShuaishuaiApplication;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.ModelResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author linYue
 * @version SelectControllerTest.java, v 0.1 2022年08月14日 11:34 PM linYue Exp $
 */
@SpringBootTest(classes = ShuaishuaiApplication.class)
@Slf4j
@AutoConfigureMockMvc
class SelectControllerTest {

    @Resource
    private MockMvc mockMvc;

    @Test
    void selectById() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/selectbyid/3"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andReturn();

        log.info(mvcResult.getResponse().getContentAsString());

    }


    @Test
    void selectAdressById() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/selectAdressById/3"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andReturn();

        log.info(mvcResult.getResponse().getContentAsString());

    }

}