package com.example.crud_book.controller;

import com.example.crud_book.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BookController {
    @Autowired
    private BookRepo bookRepo;

    @GetMapping("/getAllBooks")
    public ResponseEntity<List<Book>> getAllBooks() {
        try {
            List<Book> bookList = new ArrayList<>();
            bookRepo.findAll().forEach(bookList::add);

            if (bookList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(bookList, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/getBookById/{id}")
    public ResponseEntity<Book> getBookByID(@PathVariable Long id) {
        Optional<Book> bookData = bookRepo.findById(id);

        if (bookData.isPresent()) {
            return new ResponseEntity<>(bookData.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public void addBook() {

    }

    @PostMapping
    public void updateBookById() {

    }

    @DeleteMapping
    public void deleteBookById() {

    }



}
