package com.example.vo;

import com.example.pojo.User;

import java.io.Serializable;

public class QueryVO implements Serializable {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
