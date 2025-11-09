package com.vignesh.library.repository;

import com.vignesh.library.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByIsbn(String isbn);
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByAuthorContaining(String author);
    List<Book> findBySubject(String subject);
    List<Book> findByPublisher(String publisher);
    List<Book> findByYearPublished(Integer yearPublished);

    @Query("SELECT b FROM Book b WHERE LOWER(b.title) LIKE LOWER(CONCAT('%', :keyword, '%')) OR LOWER(b.subject) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Book> searchByTitleOrSubject(@Param("keyword") String keyword);
    boolean existsByIsbn(String isbn);
}
