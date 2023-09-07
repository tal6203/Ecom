package com.myh2.demo.controller;

import com.myh2.demo.model.Book;
import com.myh2.demo.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
//@RequestMapping("/api/books")
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(value = "/books")
    public Iterable<Book> findall() {
        return bookRepository.findAll();

    }
    @PostMapping("/books")
    public Book post(@RequestBody Book book){
       return bookRepository.save(book);
    }

    @GetMapping("/books/{id}")
    public Book getById(@PathVariable(value = "id") int id){
        return bookRepository.findById(id).get();
    }
    @PutMapping("/books/{id}")
    public  Book put(@PathVariable(value = "id") int id,@RequestBody Book bookDetails){
       return bookRepository.save(bookDetails);
    }
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable(value = "id") int id){
        Book book = bookRepository.findById(id).get();
        bookRepository.delete(book);
    }

}
