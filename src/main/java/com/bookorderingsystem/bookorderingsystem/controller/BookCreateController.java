package com.bookorderingsystem.bookorderingsystem.controller;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import com.bookorderingsystem.bookorderingsystem.model.BookCreateReq;
import com.bookorderingsystem.bookorderingsystem.service.CreateBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookCreateController {

    @Autowired
    private CreateBookService createBookService;

    @PostMapping
    public List<BookDetails> createBook(@RequestBody List<BookCreateReq> list ){
        return createBookService.createBook(list);
    }
}
