package com.sec.demo.service.impl;

import com.sec.demo.dao.UserDao;
import com.sec.demo.pojo.User;
import com.sec.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by WangZJ on 2018/8/13.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public String getPasswordByUserName(String username) {
        return userDao.getPasswordByUserName(username);
    }
    
    @Override
    public User findUserByName(String name) {
		// TODO Auto-generated method stub
		return userDao.findUserByName(name);
	}
}
