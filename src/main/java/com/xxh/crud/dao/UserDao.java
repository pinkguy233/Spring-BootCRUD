package com.xxh.crud.dao;

import com.xxh.crud.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {

    List<User> loadAll();

    User getUser(int id);

    void  addUser(User user);

    void deleteUser(int id);

    void update(User user);
}
