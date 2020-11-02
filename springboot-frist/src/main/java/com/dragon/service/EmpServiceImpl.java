package com.dragon.service;

import com.dragon.dao.EmpMapper;
import com.dragon.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmpServiceImpl implements EmpService{
    @Autowired
    private  EmpMapper empMapper;
    @Override

    public List<Emp> queryAllemp() {

        return empMapper.queryAllemp();
    }

    @Override
    public void addEmp(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
        empMapper.addEmp(emp);
    }

    @Override
    public void deleEmp(String id) {
        empMapper.deleEmp(id);
    }

    @Override
    public Emp Empbyid(String id) {
        return empMapper.Empbyid(id);
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateEmp(emp);
    }


}
