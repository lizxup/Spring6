package org.example.spring6.service;

import org.example.spring6.dao.OrderDao;

public class OrderService {

    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }



    public void generate(){
        orderDao.insert();
    }
}
