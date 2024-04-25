package com.bookorderingsystem.bookorderingsystem.model;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class CreateOrderRequest {


    private String customerName;
    private BookDetails bookDetails;
    private Integer quantity;
}
