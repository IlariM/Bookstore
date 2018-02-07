package com.example.Bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String title;
private String author;
private long year;
private long isbn;
private long price;

public Book(String title, String author, long year, long isbn, long price) {
	super();
	
	this.title = title;
	this.author = author;
	this.year = year;
	this.isbn = isbn;
	this.price = price;
}

public Book() {
	super();
	this.id=0;
	this.title = null;
	this.author = null;
	this.year = 0;
	this.isbn = 0;
	this.price = 0;
}

	

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public long getYear() {
	return year;
}

public void setYear(long year) {
	this.year = year;
}

public long getIsbn() {
	return isbn;
}

public void setIsbn(long isbn) {
	this.isbn = isbn;
}

public long getPrice() {
	return price;
}

public void setPrice(long price) {
	this.price = price;
}

@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn
			+ ", price=" + price + "]";
}



}
