package com.example.Bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Bookstore.domain.BookRepository;
@Controller
public class BookstoreController {
@Autowired
private BookRepository repository;

@RequestMapping("/booklist")
public String BookRepository(Model model){
	model.addAttribute("books", repository.findAll());
	return "booklist";
}


}
