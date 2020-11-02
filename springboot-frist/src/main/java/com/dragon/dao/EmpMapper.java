package com.dragon.dao;

import com.dragon.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface EmpMapper {
    List<Emp> queryAllemp();
    //添加员工
    void addEmp(Emp emp);

    void deleEmp(String id);

    void updateEmp(Emp emp);

    Emp Empbyid(String id);

}
