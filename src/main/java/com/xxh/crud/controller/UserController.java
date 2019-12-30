package com.xxh.crud.controller;

import com.xxh.crud.entity.User;
import com.xxh.crud.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    private UserService us;

    @ResponseBody
    @RequestMapping("show")
    public String show(){

        System.out.println("J");
        List<User> users = us.loadUser();
        for (User u:users) {
            System.out.println(u.toString());
        }

        return "Hello,User";
    }


}
