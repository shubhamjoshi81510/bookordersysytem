package com.bookorderingsystem.bookorderingsystem.controller;

import com.bookorderingsystem.bookorderingsystem.service.DeleteBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookDeleteController {

    @Autowired
    private DeleteBookService deleteBookService;

    @DeleteMapping("{bookId}")
    public String deleteById(@PathVariable  String bookId){
        deleteBookService.deleteBookByID(bookId);
        return bookId + "book has been deleted ";

    }

    @DeleteMapping
    public String deleteAllBook(){
        deleteBookService.deleteAllBook();
        return "all book has been deleted from records";

    }

}
