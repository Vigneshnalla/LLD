package com.vignesh.library.service;

import com.vignesh.library.model.entity.Book;
import com.vignesh.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Optional<Book> getBookByIsbn(String isbn) {
        return bookRepository.findByISBN(isbn);
    }

    public List<Book> searchBooksByTitle(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }

    // Change this method in BookService:
    public List<Book> searchBooksByAuthor(String author) {
        return bookRepository.findByAuthorNameContaining(author); // ✅ Updated method name
    }

    public List<Book> searchBooks(String keyword) {
        return bookRepository.searchByTitleOrSubject(keyword);
    }

    public List<Book> getBooksBySubject(String subject) {
        return bookRepository.findBySubject(subject);
    }

    public List<Book> getBooksByPublisher(String publisher) {
        return bookRepository.findByPublisher(publisher);
    }

    public Book updateBook(Long bookId, Book bookDetails) {
        Optional<Book> bookOpt = bookRepository.findById(bookId);
        if (bookOpt.isPresent()) {
            Book book = bookOpt.get();
            book.setTitle(bookDetails.getTitle());
            book.setSubject(bookDetails.getSubject());
            book.setPublisher(bookDetails.getPublisher());
            book.setLanguage(bookDetails.getLanguage());
            book.setNumberOfPages(bookDetails.getNumberOfPages());
            book.setAuthors(bookDetails.getAuthors());
            return bookRepository.save(book);
        }
        return null;
    }

    public boolean deleteBook(Long bookId) {
        if (bookRepository.existsById(bookId)) {
            bookRepository.deleteById(bookId);
            return true;
        }
        return false;
    }

    public boolean isbnExists(String isbn) {
        return bookRepository.existsByISBN(isbn);
    }
}