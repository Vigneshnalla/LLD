package com.vignesh.library.service;

import com.vignesh.library.model.entity.Account;
import com.vignesh.library.model.enums.AccountStatus;
import com.vignesh.library.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Optional<Account> getAccountById(String id) {
        return accountRepository.findById(id);
    }

    public Optional<Account> getAccountByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

    public List<Account> getAccountsByStatus(AccountStatus status) {
        return accountRepository.findByStatus(status);
    }

    public List<Account> searchAccounts(String keyword) {
        return accountRepository.searchByEmailOrName(keyword);
    }

    public Account updateAccountStatus(String accountId, AccountStatus status) {
        Optional<Account> accountOpt = accountRepository.findById(accountId);
        if (accountOpt.isPresent()) {
            Account account = accountOpt.get();
            account.setStatus(status);
            return accountRepository.save(account);
        }
        return null;
    }

    public boolean deleteAccount(String accountId) {
        if (accountRepository.existsById(accountId)) {
            accountRepository.deleteById(accountId);
            return true;
        }
        return false;
    }

    public boolean emailExists(String email) {
        return accountRepository.existsByEmail(email);
    }
}