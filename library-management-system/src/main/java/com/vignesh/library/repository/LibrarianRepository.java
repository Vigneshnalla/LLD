package com.vignesh.library.repository;

import com.vignesh.library.model.entity.Librarian;
import com.vignesh.library.model.enums.AccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, String> {

    Optional<Librarian> findByEmployeeId(String employeeId);

    boolean existsByEmployeeId(String employeeId);

    List<Librarian> findByStatus(AccountStatus status);
}