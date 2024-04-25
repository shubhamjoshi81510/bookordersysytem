package com.bookorderingsystem.bookorderingsystem.repository;

import com.bookorderingsystem.bookorderingsystem.entity.BookDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookDetails ,String > {
}
