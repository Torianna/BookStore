package com.example.demo.services;

import com.example.demo.entities.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book getBookById(int id);

    Book deleteBookById(int id);

    Book editBookById(int id, Book book);

    Book saveBook(Book book);
}
