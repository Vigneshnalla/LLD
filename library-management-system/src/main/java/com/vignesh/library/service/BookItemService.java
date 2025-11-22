package com.vignesh.library.service;

import com.vignesh.library.model.entity.BookItem;
import com.vignesh.library.model.enums.BookFormat;
import com.vignesh.library.model.enums.BookStatus;
import com.vignesh.library.repository.BookItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookItemService {

    @Autowired
    private BookItemRepository bookItemRepository;

    public BookItem addBookItem(BookItem bookItem) {
        return bookItemRepository.save(bookItem);
    }

    public Optional<BookItem> getBookItemById(Long id) {
        return bookItemRepository.findById(id);
    }

    public Optional<BookItem> getBookItemByBarcode(String barcode) {
        return bookItemRepository.findByBarcode(barcode);
    }

    public List<BookItem> getBookItemsByBookId(Long bookId) {
        return bookItemRepository.findByBookId(bookId);
    }

    public List<BookItem> getBookItemsByStatus(BookStatus status) {
        return bookItemRepository.findByStatus(status);
    }

    public List<BookItem> getBookItemsByFormat(BookFormat format) {
        return bookItemRepository.findByBookFormat(format);
    }

    public List<BookItem> getBookItemsByIsbn(String isbn) {
        return bookItemRepository.findByBookISBN(isbn);
    }

    public long getAvailableCopiesCount(Long bookId) {
        return bookItemRepository.countAvailableCopiesByBookId(bookId);
    }

    public BookItem updateBookItemStatus(Long bookItemId, BookStatus status) {
        Optional<BookItem> bookItemOpt = bookItemRepository.findById(bookItemId);
        if (bookItemOpt.isPresent()) {
            BookItem bookItem = bookItemOpt.get();
            bookItem.setStatus(status);
            return bookItemRepository.save(bookItem);
        }
        return null;
    }

    public boolean deleteBookItem(Long bookItemId) {
        if (bookItemRepository.existsById(bookItemId)) {
            bookItemRepository.deleteById(bookItemId);
            return true;
        }
        return false;
    }

    public boolean barcodeExists(String barcode) {
        return bookItemRepository.existsByBarcode(barcode);
    }
}