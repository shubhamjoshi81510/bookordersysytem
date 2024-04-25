package com.bookorderingsystem.bookorderingsystem.service;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import com.bookorderingsystem.bookorderingsystem.exception.NotFoundException;
import com.bookorderingsystem.bookorderingsystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;
@Service
public class GetBookServiceImpl implements  GetbookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<BookDetails> getAllBook() {
      return  bookRepository.findAll();


    }

    @Override
    public BookDetails getBookByID(String bookId) {

       Optional<BookDetails> bookDetails = bookRepository.findById(bookId);
       if(bookDetails.isEmpty()){
           throw new NotFoundException("Book  with id" + bookId +"not found ");
       }
       return bookDetails.get();
    }
}
