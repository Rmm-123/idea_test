package com.rm.test;

import com.rm.mapper.UsersMapper;
import com.rm.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Auther: rmm
 * @Date: 2019/9/26
 * @Description: com.rm.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void selectAllUsersTset() {
        List<Users> users=this.usersMapper.selectUserAll();
        System.out.println(users);
    }

    @Test
    public void insertUserTest(){
        Users users=new Users();
        users.setUsername("张三1");
        users.setPassword("123");
        users.setAge(25);
        users.setSex("男");
        String birth="20190926";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Date date=null;
        try {
            date=sdf.parse(birth);
            System.out.println(date);
            users.setBirth(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.usersMapper.insertUser(users);
        System.out.println("插入"+users+"成功");
    }
}
