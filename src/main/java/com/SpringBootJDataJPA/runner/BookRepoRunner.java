package com.SpringBootJDataJPA.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.model.Book;
import com.SpringBootJDataJPA.repo.BookRepository;
@Component
public class BookRepoRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		/*
		repo.saveAll(Arrays.asList(
						new Book(101, "Core Java", "SAM", 300.0, "Backend"),
						new Book(102, "Advanced Java", "RAM", 400.0, "Backend"),
						new Book(103, "Spring Boot", "SAM", 500.0, "Backend"),
						new Book(104, "Angular", "SAM", 600.0, "UI"),
						new Book(105, "HTML", "RAM", 700.0, "UI"),
						new Book(106, "SQL/PLSQL", "SAM", 800.0, "DATABASE")
						));
		*/
		Book b=new Book();
		b.setAuthor("SAM");
		b.setBookType("Backend");
		
		//Convert this into Example object
		Example<Book> example=Example.of(b);
		
		//fetch data
		List<Book> list=repo.findAll(example);
		list.forEach(System.out::println);
		
		System.out.println("DONE");
	}

}
