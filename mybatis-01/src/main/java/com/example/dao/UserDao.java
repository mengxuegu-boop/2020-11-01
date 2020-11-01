package com.example.dao;

import com.example.pojo.User;
import com.example.vo.QueryVO;

import java.util.List;

public interface UserDao {
    User findById(Integer id);

    List<User> findByName(String username);

    void save(User user);

    List<User> findByQueryVO(QueryVO queryVO);

    List<User> findAll();

}
