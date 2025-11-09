package com.vignesh.library.repository;

import com.vignesh.library.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

    Optional<Member> findByMembershipId(String membershipId);

    // find members whose membership expired
    List<Member> findByMembershipExpiryDateBefore(java.time.LocalDate date);

    @Query("SELECT m FROM Member m WHERE m.totalBooksCheckedOut > 0")
    List<Member> findMembersWithBorrowedBooks();

    boolean existsByMembershipId(String membershipId);
}