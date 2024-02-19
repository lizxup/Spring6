package org.example.spring6.service;

import org.example.spring6.dao.UserDao;

public class UserService {


    private UserDao userDao;


    // set注入的方法 必须提供一个set方法。
    // spring容器会调用这个set方法 ,来给userDao属性赋值。

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }


    //目的是给userDao属性赋值，通过的方式是set方法 ，property 的名称首字母大写拼上set 调用这个set方法  参数列表为ref后面的值。
//    这个set方法本质 就是在配置依赖注入  ，名称相同的 是为了  更好理解
    public void saveUser(){
        userDao.insert();
    }
}
