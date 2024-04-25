package com.bookorderingsystem.bookorderingsystem.service;

import com.bookorderingsystem.bookorderingsystem.entity.OrderDetails;
import com.bookorderingsystem.bookorderingsystem.model.CreateOrderRequest;

public interface CreateOrderService {

    public OrderDetails createOrder(CreateOrderRequest createOrderRequest,String bookId);


}
