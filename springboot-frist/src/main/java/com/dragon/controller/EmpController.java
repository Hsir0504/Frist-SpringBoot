package com.dragon.controller;

import com.dragon.pojo.Emp;
import com.dragon.service.EmpService;
import com.dragon.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    EmpServiceImpl empService;

    @RequestMapping("/query")
    public String getemp(Model model){
        List<Emp> empList = empService.queryAllemp();
        model.addAttribute("emps",empList);
        return "ems/emplist";

    }

    @RequestMapping("/save")
    public String tosave(Emp emp)
    {
        empService.addEmp(emp);
        return "redirect:/emp/query";
    }
    @RequestMapping("/delete")
    public String delete(String id){
        empService.deleEmp(id);
        return "redirect:/emp/query";
    }
    @RequestMapping("/find")
    public String update(String id,Model model){
        Emp emp = empService.Empbyid(id);
        model.addAttribute("emp",emp);
        return "ems/updateEmp";
    }
    @RequestMapping("/update")
    public String toupdate(Emp emp){
        empService.updateEmp(emp);
        return "redirect:/emp/query";
    }

}
