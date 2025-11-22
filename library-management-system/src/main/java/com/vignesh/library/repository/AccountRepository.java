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
public interface AccountRepository extends JpaRepository<Account, String> { // ✅ Changed to String (account_id)

    List<Account> findByStatus(AccountStatus status);

    // ✅ Fixed: Direct email field (no more person.email)
    Optional<Account> findByEmail(String email);

    // ✅ Fixed: Direct email field
    boolean existsByEmail(String email);

    // ✅ Fixed: Direct name and email fields (no more person.)
    @Query("SELECT a FROM Account a WHERE LOWER(a.email) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(a.name) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Account> searchByEmailOrName(@Param("keyword") String keyword);

    // ✅ Additional useful methods
    List<Account> findByNameContainingIgnoreCase(String name);

    Optional<Account> findByPhoneNo(String phoneNo);
}