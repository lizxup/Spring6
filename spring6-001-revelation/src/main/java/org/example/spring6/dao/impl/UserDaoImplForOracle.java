package org.example.spring6.dao.impl;

import org.example.spring6.dao.UserDao;

public class UserDaoImplForOracle implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("oracle数据库在删除用户数据......");
    }
}
