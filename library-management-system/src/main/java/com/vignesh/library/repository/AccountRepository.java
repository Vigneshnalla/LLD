package com.vignesh.library.repository;

import com.vignesh.library.model.entity.Account;
import com.vignesh.library.model.enums.AccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByStatus(AccountStatus status);

    Optional<Account> findByPersonEmail(String email);

    boolean existsByPersonEmail(String email);

    @Query("SELECT a FROM Account a WHERE LOWER(a.person.email) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(a.person.name) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Account> searchByEmailOrName(@Param("keyword") String keyword);

}
