package com.SpringBootJDataJPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book_tab")
public class Book {
	@Id
	@Column(name = "bid")
	private Integer bookId;
	@Column(name = "bname")
	private String bookName;
	@Column(name = "bauthor")
	private String author;
	@Column(name = "bcost")
	private Double bookCost;
	@Column(name = "type")
	private String bookType;
}
