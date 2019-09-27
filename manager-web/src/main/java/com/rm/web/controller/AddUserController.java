package com.rm.web.controller;

import com.rm.pojo.Users;
import com.rm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: rmm
 * @Date: 2019/9/27
 * @Description: com.rm.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class AddUserController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        System.out.println(users.getBirth());
        System.out.println(users.getSex());
        usersService.addUser(users);
        return "ok";
    }

}
