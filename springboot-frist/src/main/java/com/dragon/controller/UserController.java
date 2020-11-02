package com.dragon.controller;

import com.dragon.pojo.User;
import com.dragon.service.UserServiceImpl;
import com.dragon.until.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.invoke.SerializedLambda;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @RequestMapping("/code")
    //生成验证码
    public void getimage(HttpSession session, HttpServletResponse respon) throws IOException {
        //使用工具类生成验证码
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        //把验证码生成图片格式
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        session.setAttribute("code",securityCode); //存入session作用域中
        //响应图片
        ServletOutputStream os = respon.getOutputStream();
        ImageIO.write(image,"png",os);
    }
    @RequestMapping("/register")
    public String Submit(User user,String code,HttpSession session){
        String attribute = (String) session.getAttribute("code");
        if(attribute.equalsIgnoreCase(code)) //忽略大小写
        {
            userService.post(user);
            return "redirect:/index";
        }
        else
            return "redirect:/toRegister";

    }

    @RequestMapping("/login")
    public String login(String username,String password){
        User user =userService.login(username);
        if(user != null && user.getPassword().equals(password))
        {
            return "redirect:/emp/query";
        }
        else {
            return "redirect:/index";
        }
    }
}
