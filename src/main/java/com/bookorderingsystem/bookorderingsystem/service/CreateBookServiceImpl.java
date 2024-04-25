package com.bookorderingsystem.bookorderingsystem.service;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import com.bookorderingsystem.bookorderingsystem.model.BookCreateReq;
import com.bookorderingsystem.bookorderingsystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CreateBookServiceImpl implements CreateBookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookDetails> createBook(List<BookCreateReq> list) {
        List<BookDetails> list1 = new ArrayList<>();

        for (BookCreateReq req : list) {
            BookDetails bookDetails = new BookDetails();
            bookDetails.setBookId(UUID.randomUUID().toString());
            bookDetails.setAuthorName(req.getAuthorName());
            bookDetails.setBookQuantity(req.getBookQuantity());
            bookDetails.setBookAmount(req.getBookAmount());
            bookDetails.setBookName(req.getBookName());
            bookRepository.save(bookDetails);
            list1.add(bookDetails);
        }

        return list1;
    }
}

