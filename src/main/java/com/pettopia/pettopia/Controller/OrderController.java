package com.pettopia.pettopia.Controller;


import com.pettopia.pettopia.Entities.OrdersEntity;
import com.pettopia.pettopia.Services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/order")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/getAllOrders")
    public List<OrdersEntity> getAllOrders(){

        List<OrdersEntity> ordersList=ordersService.getAllOrders();
        return ordersList;
    }
}
