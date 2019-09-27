package com.rm.service.impl;

import com.rm.mapper.UsersMapper;
import com.rm.pojo.Users;
import com.rm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: rmm
 * @Date: 2019/9/27
 * @Description: com.rm.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersMapper usersMapper;


    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
