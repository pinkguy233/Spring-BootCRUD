package com.xxh.crud.dao;

import com.xxh.crud.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {

    List<User> loadAll();
}
