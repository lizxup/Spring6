package org.example.spring6.service;

import org.example.spring6.dao.UserDao;
import org.example.spring6.dao.VipDao;

public class CustomerService {

    private UserDao userDao;
    private VipDao vipDao;

    public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void save(){
        userDao.insert();
        vipDao.insert();
    }
}
