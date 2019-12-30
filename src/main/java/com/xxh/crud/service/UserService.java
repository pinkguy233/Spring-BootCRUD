package com.xxh.crud.service;

import com.xxh.crud.dao.UserDao;
import com.xxh.crud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao ud;

    public List<User> loadUser(){
        return ud.loadAll();
    }


}
