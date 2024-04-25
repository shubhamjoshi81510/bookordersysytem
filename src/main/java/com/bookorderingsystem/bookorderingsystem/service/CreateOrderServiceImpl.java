package com.bookorderingsystem.bookorderingsystem.service;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import com.bookorderingsystem.bookorderingsystem.entity.OrderDetails;
import com.bookorderingsystem.bookorderingsystem.exception.NotFoundException;
import com.bookorderingsystem.bookorderingsystem.model.CreateOrderRequest;
import com.bookorderingsystem.bookorderingsystem.repository.BookRepository;
import com.bookorderingsystem.bookorderingsystem.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service

public class CreateOrderServiceImpl implements  CreateOrderService{

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderDetails createOrder(CreateOrderRequest createOrderRequest,String bookId) {
        OrderDetails orderDetails = new OrderDetails();

        Optional<BookDetails> bookDetailsOptional = bookRepository.findById(bookId);

        if(bookDetailsOptional.isEmpty()) {
            // throw exception book not found
            throw new NotFoundException("Book not found with bookId"+ bookId);

        }

        BookDetails book= bookDetailsOptional.get();

        if(book.getBookQuantity() == 0){
            throw new NotFoundException("out of stock");
        }
        orderDetails.setOrderId(UUID.randomUUID().toString());
        orderDetails.setQuantity(createOrderRequest.getQuantity());
        orderDetails.setCustomerName(createOrderRequest.getCustomerName());
        orderDetails.setBookDetails(book);
        book.setBookQuantity(book.getBookQuantity() - createOrderRequest.getQuantity());
        bookRepository.save(book);

        return orderRepository.save(orderDetails);
    }
}
