package com.test.modules.user.service;

import com.test.modules.user.dao.UserDao;
import com.test.modules.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUserById(int id){
        return userDao.getUserById(id);
    }
}
