package com.zcwbank.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountServices accountServices;

    @RequestMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accountServices.getAllAccounts();
    }


    @RequestMapping("/accounts/customer_id")
    public Account getAccount(@PathVariable Long customer_id) {
        return accountServices.getAccount(customer_id);
    }

    @RequestMapping("/customers/{customer_id}/accounts")
    public Account getAccountByCustomerId(@PathVariable Long customer_id){
        return accountServices.getAccountByCustomerId(customer_id);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/accounts/account_id")
    public void updateAccount(@RequestBody Account account, @PathVariable Long account_id) {
        accountServices.updateAccount(account_id, account);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customers/{customer_id}/accounts")
    public void addAccount(@RequestBody Account account, @PathVariable Long customer_id){
        accountServices.addAccount(account);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/accounts/{account_id}")
    public void deleteAccount(@PathVariable Long account_id){
        accountServices.deleteAccount(account_id);
    }



}

