package com.SpringBootJDataJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootJDataJPA.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
