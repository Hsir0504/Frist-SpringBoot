package com.dragon;

import com.dragon.pojo.Emp;
import com.dragon.service.EmpService;
import com.dragon.service.EmpServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@SpringBootTest
class SpringbootFristApplicationTests {
    @Autowired
    EmpServiceImpl empService;

    @Test
    void contextLoads() {

//        EmpServiceImpl empService = new EmpServiceImpl();

        empService.deleEmp("1");


    }

}
