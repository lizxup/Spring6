package org.example.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VipDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);



    public void insert(){
        logger.info("vip信息正在保存");
    }
}
