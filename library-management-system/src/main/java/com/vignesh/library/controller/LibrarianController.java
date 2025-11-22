package com.vignesh.library.controller;

import com.vignesh.library.model.entity.Librarian;
import com.vignesh.library.service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/librarians")
public class LibrarianController {

    @Autowired
    private LibrarianService librarianService;

    @PostMapping
    public ResponseEntity<Librarian> createLibrarian(@RequestBody Librarian librarian) {
        Librarian savedLibrarian = librarianService.createLibrarian(librarian);
        return ResponseEntity.ok(savedLibrarian);
    }

    @GetMapping
    public ResponseEntity<List<Librarian>> getAllLibrarians() {
        List<Librarian> librarians = librarianService.getAllLibrarians();
        return ResponseEntity.ok(librarians);
    }

/* <<<<<<<<<<<<<<  ✨ Windsurf Command ⭐ >>>>>>>>>>>>>>>> */
    /**
     * Retrieve a librarian by ID.
     * @param id The ID of the librarian.
     * @return A ResponseEntity containing the librarian if found, or a 404 if not found.
     */
/* <<<<<<<<<<  92a5a1bc-58f2-4354-881d-8288fa692143  >>>>>>>>>>> */
    @GetMapping("/{id}")
    public ResponseEntity<Librarian> getLibrarianById(@PathVariable String id) {
        Librarian librarian = librarianService.getLibrarianById(id);
        return librarian != null ? ResponseEntity.ok(librarian) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Librarian> updateLibrarian(@PathVariable String id, @RequestBody Librarian librarian) {
        Librarian updatedLibrarian = librarianService.updateLibrarian(id, librarian);
        return updatedLibrarian != null ? ResponseEntity.ok(updatedLibrarian) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLibrarian(@PathVariable String id) {
        boolean deleted = librarianService.deleteLibrarian(id);
        return deleted ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<Librarian> getLibrarianByEmployeeId(@PathVariable String employeeId) {
        Librarian librarian = librarianService.getLibrarianByEmployeeId(employeeId);
        return librarian != null ? ResponseEntity.ok(librarian) : ResponseEntity.notFound().build();
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Librarian>> getLibrariansByStatus(@PathVariable String status) {
        List<Librarian> librarians = librarianService.getLibrariansByStatus(status);
        return ResponseEntity.ok(librarians);
    }
}