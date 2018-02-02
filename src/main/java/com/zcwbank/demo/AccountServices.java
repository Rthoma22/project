package com.zcwbank.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServices {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        List<Account> account = new ArrayList<>();
        accountRepository.findAll().forEach(account::add);
        return account;
    }

    public Account getAccount(Long customer_id) {

        return accountRepository.findOne(customer_id);
    }

    public void addAccount(Account account) {

        accountRepository.save(account);
    }

    public void updateAccount(Long customer_id, Account account) {

        accountRepository.save(account);
    }

    public void deleteAccount(Long account_id) {
        accountRepository.delete(account_id);
    }
    public Account getAccountByCustomerId(Long customer_id){
        return accountRepository.findOne(customer_id);
    }
}
