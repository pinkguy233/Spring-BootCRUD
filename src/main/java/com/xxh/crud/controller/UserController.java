package com.xxh.crud.controller;

import com.xxh.crud.entity.User;
import com.xxh.crud.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserService us;

//    @ResponseBody
    @RequestMapping("show")
    public String show(){
        System.out.println("J");
        List<User> users = us.loadUser();
        for (User u:users) {
            System.out.println(u.toString());
        }
        return "Hello,User";
    }


    @PostMapping("save")
    public void add(@RequestBody User user){
        us.addUser(user);
        System.out.println("22");
    }

    @ResponseBody
    @RequestMapping("get/{id}")
    public String get(@PathVariable("id") int id){
        User user = us.getUser(id);
        return user.toString();
    }


    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") int id){
        us.deleteUser(id);
        return "删除..";
    }

    @PostMapping("/update")
    public String delete(@RequestBody User user){
        us.update(user);
        return "修改..";
    }

}
