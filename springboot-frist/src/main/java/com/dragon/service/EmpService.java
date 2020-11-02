package com.dragon.service;

import com.dragon.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> queryAllemp();
    //添加员工
    void addEmp(Emp emp);

    void deleEmp(String id);

    Emp Empbyid(String id);

    void updateEmp(Emp emp);
}
