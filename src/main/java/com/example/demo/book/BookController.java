package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


    @GetMapping("/books/{id}")
    public BookResponse getBookById(@PathVariable int id) {
        BookResponse bookResponse = new BookResponse();
        bookResponse.setId(id);
        bookResponse.setTitle("Harry Potter");
        bookResponse.setPrice(100);
        return bookResponse;
    }


}