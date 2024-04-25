package com.bookorderingsystem.bookorderingsystem.service;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;

import java.util.List;
import java.util.Optional;

public interface GetbookService {

    public List<BookDetails> getAllBook();

    public BookDetails getBookByID(String bookId);

    }

