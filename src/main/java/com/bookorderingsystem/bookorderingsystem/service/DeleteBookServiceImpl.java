package com.bookorderingsystem.bookorderingsystem.service;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import com.bookorderingsystem.bookorderingsystem.exception.NotFoundException;
import com.bookorderingsystem.bookorderingsystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteBookServiceImpl implements DeleteBookService{
    @Autowired
    private BookRepository bookRepository;
    @Override
    public String  deleteAllBook() {

        bookRepository.deleteAll();
        return "all books are deleted ";


    }

    @Override
    public String deleteBookByID(String bookId) {
        BookDetails bookDetails = new BookDetails();

        Optional<BookDetails> bookDetails1= bookRepository.findById(bookId);

        if(bookDetails1.isEmpty()) {
           throw new NotFoundException ("Book not found with Id" + bookId);

            }

            bookRepository.deleteById(bookId);
            return "Book has been deleted with bookId" + bookId;




    }



}

