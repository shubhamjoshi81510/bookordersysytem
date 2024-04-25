package com.bookorderingsystem.bookorderingsystem.controller;


import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import com.bookorderingsystem.bookorderingsystem.service.GetbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class GetBookController {
    @Autowired
    private GetbookService getbookService;
    @GetMapping
    public List<BookDetails > getAllbook(){
        return getbookService.getAllBook();
    }
    @GetMapping("{bookId}")
    public BookDetails getBookById(String bookId){
        return getbookService.getBookByID(bookId);
    }
}
