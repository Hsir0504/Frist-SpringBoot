package com.dragon.controller;

import com.dragon.pojo.User;
import com.dragon.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {


    @RequestMapping({"/","/index"})
    public String index(){

        return "ems/login";
    }
    @RequestMapping("/toRegister")
    public String post(){
        return "ems/regist";
    }

    @RequestMapping("/toSave")
    public  String save(){
        return "ems/addEmp";
    }


}
