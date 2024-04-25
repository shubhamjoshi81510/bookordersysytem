package com.bookorderingsystem.bookorderingsystem.controller;

import com.bookorderingsystem.bookorderingsystem.entity.OrderDetails;
import com.bookorderingsystem.bookorderingsystem.model.CreateOrderRequest;
import com.bookorderingsystem.bookorderingsystem.service.CreateOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class CreateOrderController {
    @Autowired
    private CreateOrderService createOrderService;

    public OrderDetails createOrder(@RequestBody CreateOrderRequest createOrderRequest,String bookId){
        return createOrderService.createOrder(createOrderRequest,bookId);

    }
}
