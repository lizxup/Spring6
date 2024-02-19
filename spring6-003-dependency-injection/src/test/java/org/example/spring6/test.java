package org.example.spring6;

import org.example.spring6.bean.User;
import org.example.spring6.service.CustomerService;
import org.example.spring6.service.OrderService;
import org.example.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class test {


    @Test
    public void testSimpleType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

    }


    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saveUser();
    }


    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
        customerService.save();
        CustomerService customerService2 = applicationContext.getBean("customerService2", CustomerService.class);
        customerService2.save();
        CustomerService customerService3 = applicationContext.getBean("customerService3", CustomerService.class);
        customerService3.save();
    }

}
