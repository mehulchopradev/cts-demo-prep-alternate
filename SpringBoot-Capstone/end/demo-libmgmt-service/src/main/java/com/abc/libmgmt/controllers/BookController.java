package com.abc.libmgmt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.libmgmt.domain.Book;
import com.abc.libmgmt.service.BookServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {
	
	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookServiceImpl.findAll();
	}
	
	@PostMapping("/books")
	public Book postBook(@RequestBody Book book) {
		return bookServiceImpl.saveBook(book);
	}
}
