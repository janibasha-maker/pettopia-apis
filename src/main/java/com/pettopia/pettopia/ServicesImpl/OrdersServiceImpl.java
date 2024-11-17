package com.pettopia.pettopia.ServicesImpl;


import com.pettopia.pettopia.Entities.OrdersEntity;
import com.pettopia.pettopia.Repository.OrdersRepository;
import com.pettopia.pettopia.Services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {


    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public List<OrdersEntity> getAllOrders() {
        List<OrdersEntity> orderList=ordersRepository.findAll();
        return orderList;
    }
}
