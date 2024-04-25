package com.bookorderingsystem.bookorderingsystem.service;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import com.bookorderingsystem.bookorderingsystem.model.BookCreateReq;

import java.util.List;

public interface CreateBookService {

    public List<BookDetails> createBook(List<BookCreateReq> list );
}
