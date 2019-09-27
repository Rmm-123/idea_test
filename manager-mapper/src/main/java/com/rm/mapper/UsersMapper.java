package com.rm.mapper;

import com.rm.pojo.Users;

import java.util.List;

/**
 * @Auther: rmm
 * @Date: 2019/9/26
 * @Description: com.rm.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
