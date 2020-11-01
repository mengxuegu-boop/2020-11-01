package com.example.dao;

import com.example.pojo.Account;

import java.util.List;

public interface AccountDao {

    Account findById(Integer id);

    List<Account> findAll();

}
