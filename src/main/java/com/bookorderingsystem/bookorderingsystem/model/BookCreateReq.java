package com.bookorderingsystem.bookorderingsystem.model;

import lombok.Data;

@Data
public class BookCreateReq {

    private String bookName;
    private String authorName;
    private Integer bookQuantity;
    private Integer bookAmount ;
}
