package com.bookorderingsystem.bookorderingsystem.service;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import com.bookorderingsystem.bookorderingsystem.model.BookCreateReq;

import java.util.HashMap;

public interface UpdateBookService {

    public BookDetails updateBook(BookCreateReq bookCreateReq , String bookId);
    public BookDetails updateBookPartially(HashMap<String,String> map, String bookId);
}
