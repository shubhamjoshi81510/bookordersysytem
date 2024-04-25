package com.bookorderingsystem.bookorderingsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "OrderDetails")
@Data
public class OrderDetails {
    @Id
    @Column(name = "orderId")
    private String OrderId;

    @Column(name = "customerName")
    private String customerName;


    @ManyToOne
    @JoinColumn(name = "bookId", nullable = false)
    private BookDetails bookDetails;

    @Column(name = "quantity")
    private Integer quantity;

}
