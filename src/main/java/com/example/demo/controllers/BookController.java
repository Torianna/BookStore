package com.example.demo.controllers;

import com.example.demo.entities.Book;
import com.example.demo.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookStore/books")
@CrossOrigin

@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("")
    public ResponseEntity<List<Book>> getAllBooks (){

        List<Book> seriesList=bookService.getAllBooks();

        return seriesList.isEmpty() ? new ResponseEntity<>(seriesList, HttpStatus.NO_CONTENT):
                new ResponseEntity<>(seriesList,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getSeriesById (@PathVariable int id){

        Book book=bookService.getBookById(id);

        return book != null ? new ResponseEntity<>(book, HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBookById (@PathVariable int id)
    {
        Book book=bookService.deleteBookById(id);

        return book != null ? new ResponseEntity<>(book, HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> editBookById (@PathVariable int id, Book book)
    {
        Book editedBook =bookService.editBookById(id, book);

        return editedBook != null ? new ResponseEntity<>(editedBook, HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("")
    public ResponseEntity<Book> saveSeries(@RequestBody Book book)
    {
        Book savedBook= bookService.saveBook(book);

        return savedBook != null ? new ResponseEntity<>(savedBook, HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
