package org.example.spring6.service.impl;

import org.example.spring6.dao.UserDao;
import org.example.spring6.dao.impl.UserDaoImplForMySQL;
import org.example.spring6.service.UserService;

public class UserServiceImpl implements UserService {


    //成员变量
    private UserDao userDao = new UserDaoImplForMySQL();



    @Override
    public void deleteUser() {

        //删除用户信息的业务逻辑

        userDao.deleteById();
    }
}
