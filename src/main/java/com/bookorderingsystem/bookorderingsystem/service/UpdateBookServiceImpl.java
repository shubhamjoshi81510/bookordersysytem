package com.bookorderingsystem.bookorderingsystem.service;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import com.bookorderingsystem.bookorderingsystem.exception.NotFoundException;
import com.bookorderingsystem.bookorderingsystem.model.BookCreateReq;
import com.bookorderingsystem.bookorderingsystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;

@Service

public class UpdateBookServiceImpl implements UpdateBookService{
    @Autowired
    private BookRepository bookRepository;
    @Override
    public BookDetails updateBook(BookCreateReq bookCreateReq , String bookId) {
        BookDetails bookDetails = new BookDetails();

        Optional<BookDetails> bookDetails1= bookRepository.findById(bookId);

        if(bookDetails1.isEmpty()) {
            throw new NotFoundException("Book not found with Id" + bookId);

        }
        bookDetails.setBookId(bookId);
        bookDetails.setBookName(bookCreateReq.getBookName());
        bookDetails.setBookQuantity(bookCreateReq.getBookQuantity());
        bookDetails.setBookAmount(bookCreateReq.getBookAmount());
        bookDetails.setAuthorName(bookCreateReq.getAuthorName());
        return bookRepository.save(bookDetails);



    }

    @Override
    public BookDetails updateBookPartially(HashMap<String,String> map, String bookId) {

        BookDetails bookDetails = new BookDetails();

        Optional<BookDetails> bookDetails1= bookRepository.findById(bookId);

        if(bookDetails1.isEmpty()) {
            throw new NotFoundException("Book not found with Id" + bookId);

        }

        if(map.containsKey("bookName")){
            bookDetails.setBookName(map.get("bookName"));
        }

        if(map.containsKey("bookQuantity")){
            bookDetails.setBookQuantity(Integer.parseInt(map.get("bookQuantity")));
        }
        if(map.containsKey("bookAmount")){
            bookDetails.setBookAmount(Integer.parseInt(map.get("bookAmount")));
        }

        if(map.containsKey("authorName")){
            bookDetails.setAuthorName(map.get("authorName"));
        }
        return bookRepository.save(bookDetails);
    }
}
