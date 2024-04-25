package com.bookorderingsystem.bookorderingsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "book-details")
public class BookDetails {

    @Id
    @Column(name = "bookId")
    private String bookId;

    @Column(name = "bookName")
    private String bookName;

    @Column(name = "authorName")
    private String authorName;

    @Column(name = "bookQuantity")
    private Integer bookQuantity;

    @Column(name = "bookAmount ")
    private Integer bookAmount ;
}
