package com.vignesh.library.service;

import com.vignesh.library.model.entity.Librarian;
import com.vignesh.library.model.enums.AccountStatus;
import com.vignesh.library.repository.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LibrarianService {

    @Autowired
    private LibrarianRepository librarianRepository;

    public Librarian createLibrarian(Librarian librarian) {
        librarian.setStatus(AccountStatus.ACTIVE);
        if (librarian.getJoiningDate() == null) {
            librarian.setJoiningDate(LocalDate.now());
        }
        return librarianRepository.save(librarian);
    }

    public List<Librarian> getAllLibrarians() {
        return librarianRepository.findAll();
    }

    public Librarian getLibrarianById(String id) {
        return librarianRepository.findById(id).orElse(null);
    }

    public Librarian updateLibrarian(String id, Librarian librarianDetails) {
        Librarian existingLibrarian = getLibrarianById(id);
        if (existingLibrarian != null) {
            existingLibrarian.setName(librarianDetails.getName());
            existingLibrarian.setEmail(librarianDetails.getEmail());
            existingLibrarian.setPhoneNo(librarianDetails.getPhoneNo());
            existingLibrarian.setAddress(librarianDetails.getAddress());
            existingLibrarian.setEmployeeId(librarianDetails.getEmployeeId());
            existingLibrarian.setJoiningDate(librarianDetails.getJoiningDate());

            return librarianRepository.save(existingLibrarian);
        }
        return null;
    }

    public boolean deleteLibrarian(String id) {
        if (librarianRepository.existsById(id)) {
            librarianRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public Librarian getLibrarianByEmployeeId(String employeeId) {
        return librarianRepository.findByEmployeeId(employeeId).orElse(null);
    }

    public List<Librarian> getLibrariansByStatus(String status) {
        AccountStatus accountStatus = AccountStatus.valueOf(status.toUpperCase());
        return librarianRepository.findByStatus(accountStatus);
    }

    public boolean employeeIdExists(String employeeId) {
        return librarianRepository.existsByEmployeeId(employeeId);
    }
}