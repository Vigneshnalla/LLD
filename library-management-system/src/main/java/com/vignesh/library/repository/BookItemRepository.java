package com.vignesh.library.repository;

import com.vignesh.library.model.entity.BookItem;
import com.vignesh.library.model.enums.BookFormat;
import com.vignesh.library.model.enums.BookStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookItemRepository extends JpaRepository<BookItem, Long> {

    Optional<BookItem> findByBarcode(String barcode);

    List<BookItem> findByBookId(Long bookId);

    List<BookItem> findByStatus(BookStatus status);

    List<BookItem> findByBookFormat(BookFormat bookFormat);

    @Query("SELECT bi FROM BookItem bi WHERE bi.book.ISBN = :isbn")
    List<BookItem> findByBookISBN(@Param("isbn") String isbn);


    @Query("SELECT COUNT(bi) FROM BookItem bi WHERE bi.book.id = :bookId AND bi.status = 'AVAILABLE'")
    long countAvailableCopiesByBookId(@Param("bookId") Long bookId);

    boolean existsByBarcode(String barcode);
}
