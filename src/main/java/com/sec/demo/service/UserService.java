package com.sec.demo.service;


import com.sec.demo.pojo.User;

/**
 * Created by WangZJ on 2018/8/13.
 */
public interface UserService {
    String getPasswordByUserName(String username);
    
    User findUserByName(String name);
}
