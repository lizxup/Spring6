package org.example.spring6.bean;


/**
 * 这是一个Bean，封装了用户信息，spring可以帮助我们创建User对象？
 */
public class User {
    //默认添加了 无参构造


//    默认情况下spring会通过反射机制，调用类的 无参构造方法 来实例化对象。  注意只能调用无参构造
//    实现原理如下：
    //class clazz = Class.forName("org.example.spring6.bean.User");
    //Object obj = clazz.newInstance();
    public User(){
        System.out.println("创建User对象...");
    }
}
