package com.vignesh.library.repository;

import com.vignesh.library.model.entity.BookLending;
import com.vignesh.library.model.enums.LendingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookLendingRepository extends JpaRepository<BookLending, Long> {

    List<BookLending> findByMemberId(String memberId);

    List<BookLending> findByMemberIdAndStatus(String memberId, LendingStatus status);

    List<BookLending> findByBookItemId(Long bookItemId);

    List<BookLending> findByStatus(LendingStatus status);

    List<BookLending> findByDueDateBeforeAndStatus(LocalDate date, LendingStatus status);

    @Query("SELECT bl FROM BookLending bl WHERE bl.bookItem.id = :bookItemId AND bl.status = 'BORROWED'")
    Optional<BookLending> findActiveLendingByBookItemId(@Param("bookItemId") Long bookItemId);

    @Query("SELECT COUNT(bl) FROM BookLending bl WHERE bl.member.id = :memberId AND bl.status = 'BORROWED'")
    long countActiveLendingsByMemberId(@Param("memberId") String memberId);

    @Query("SELECT bl FROM BookLending bl WHERE bl.dueDate < :currentDate AND bl.status = 'BORROWED'")
    List<BookLending> findOverdueLendings(@Param("currentDate") LocalDate currentDate);
}