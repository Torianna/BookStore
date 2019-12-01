package com.example.demo.services.implementation;

import com.example.demo.entities.Book;
import com.example.demo.respositories.BookRepository;
import com.example.demo.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int id) {
        Optional<Book> book = bookRepository.findById(id);

        return book.orElse(null);
    }

    @Override
    public Book deleteBookById(int id) {

        Optional<Book> book = bookRepository.findById(id);

        if (book.isPresent()) {
            bookRepository.deleteById(id);

            return book.get();
        }
        return null;
    }

    @Override
    public Book editBookById(int id, Book book) {

        Optional<Book> editedBook = bookRepository.findById(id);
        if (editedBook.isPresent()) {
            bookRepository.deleteById(id);
            bookRepository.save(new Book(book.getId(), book.getTitle(), book.getAuthor(), book.getISBN()));

            return book;
        }
        return null;
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
