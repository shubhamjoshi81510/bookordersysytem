package com.bookorderingsystem.bookorderingsystem.controller;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import com.bookorderingsystem.bookorderingsystem.model.BookCreateReq;
import com.bookorderingsystem.bookorderingsystem.service.UpdateBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
@RequestMapping("/books")
public class BookUpdateController {

    @Autowired
    private UpdateBookService updateBookService;


    public BookDetails updateAllField(@RequestBody BookCreateReq bookCreateReq,String bookId){
        return updateBookService.updateBook(bookCreateReq,bookId);
    }

    public BookDetails updateBooksPartially(@RequestBody HashMap<String ,String > map ,String bookId){
        return updateBookService.updateBookPartially(map , bookId);
    }
}
