package org.example.spring6.test;

import org.example.spring6.dao.UserDaoImplForMySQL;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FirstSpringTest {



    @Test
    public void testBegainItBean(){
        //注意：不是调用getBean()的时候创建对象，执行以下代码的时候，就会实例化对象。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");


        //自己怎么使用log4j记录信息呢？
        //第一步 ：创建日志记录对象
        //获得FirstSpringTest类的日志记录器对象，也就是说只要firstSpringTest类中的代码执行记录日志的话，就输出相关的日志信息
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);


        //第二步 ： 记录日志 ，根据不同的级别来输出日志
        logger.info("这是一条消息");
        logger.debug("这是一条错误信息");
    }


    /**
     * FileSystemXmlApplicationContext通过绝对路径的方式添加配置文件
     */
    @Test
    public void testXmlPath(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("绝对路径");
    }

    @Test
    public void testFirstSpringCode(){
        // 第一步 获取spring容器对象
        //applicationContext 是spring容器
        //applicationContext 是一个接口
        //applicationcontest 接口下有很多实现类，其中有一个实现类叫做：ClassPathXmlApplicationContext
        //ClassPathXmlApplicationContext 专门从类路径当中加载spring配置文件的一个spring上下文对象。
        //这行代码只要执行，就相当于启动了Spring容器，解析spring.xml文件，并且实例化所有的bean对象，放在spring容器中。



        //配置文件可以多参直接逗号 字符串
        //ApplicationContext 接口的超级父接口是：BeanFactory
        //BeanFactory 是IoC容器的顶级接口。
        //Spring的IoC容器底层实际上使用了 工程模式
        //Spring底层的IoC是怎么实现的？XML解析 + 工厂模式 + 反射机制
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        //第二步 根据bean的id从spring容器中获取这个对象
        Object userBean = applicationContext.getBean("userBean");
        UserDaoImplForMySQL userDaoBean = applicationContext.getBean("userDaoBean",UserDaoImplForMySQL.class);
        System.out.println(userDaoBean);
        System.out.println(userBean);
        userDaoBean.insert();


//        Object nowTime = applicationContext.getBean("nowTime");

        //强制类型转换
//        Date nowTime = (Date) applicationContext.getBean("nowTime");

//        不强制转换 通过第二个参数指定返回类型
        Date nowTime = (Date) applicationContext.getBean("nowTime",Date.class);
        //日期格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strNowTime = simpleDateFormat.format(nowTime);

        System.out.println(strNowTime);
    }
}
