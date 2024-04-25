package com.bookorderingsystem.bookorderingsystem.repository;

import com.bookorderingsystem.bookorderingsystem.entity.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface OrderRepository extends JpaRepository<OrderDetails,String> {

}
