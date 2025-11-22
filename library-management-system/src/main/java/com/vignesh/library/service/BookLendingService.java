package com.vignesh.library.service;

import com.vignesh.library.model.entity.BookLending;
import com.vignesh.library.model.enums.LendingStatus;
import com.vignesh.library.repository.BookLendingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookLendingService {

    @Autowired
    private BookLendingRepository bookLendingRepository;

    public List<BookLending> getLendingsByMember(String memberId) {
        return bookLendingRepository.findByMemberId(memberId);
    }

    public List<BookLending> getActiveLendingsByMember(String memberId) {
        return bookLendingRepository.findByMemberIdAndStatus(memberId, LendingStatus.BORROWED);
    }

    public Optional<BookLending> getActiveLendingByBookItem(Long bookItemId) {
        return bookLendingRepository.findActiveLendingByBookItemId(bookItemId);
    }

    public List<BookLending> getOverdueLendings() {
        return bookLendingRepository.findOverdueLendings(LocalDate.now());
    }

    public long getActiveLendingsCountByMember(String memberId) {
        return bookLendingRepository.countActiveLendingsByMemberId(memberId);
    }

    public boolean isBookItemAvailable(Long bookItemId) {
        return bookLendingRepository.findActiveLendingByBookItemId(bookItemId).isEmpty();
    }

    public BookLending reportBookLost(Long lendingId) {
        Optional<BookLending> lendingOpt = bookLendingRepository.findById(lendingId);
        if (lendingOpt.isPresent()) {
            BookLending lending = lendingOpt.get();
            lending.setStatus(LendingStatus.LOST);
            return bookLendingRepository.save(lending);
        }
        return null;
    }
}