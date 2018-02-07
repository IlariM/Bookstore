package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
	public CommandLineRunner BookStore(BookRepository repository){
		return new CommandLineRunner() {
			
			@Override
			public void run(String... arg0) throws Exception {
				repository.save(new Book("Paras kirja", "Paras kirjailija", 2007, 325695, 10));
				repository.save(new Book("toisiksi paras kirja", "Second best", 2006, 3554654,12));
				
				for(Book book: repository.findAll()){
					System.out.println(book.toString());
				}
			};
		};
	}
}
