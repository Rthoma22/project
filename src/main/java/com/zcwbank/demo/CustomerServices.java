package com.zcwbank.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServices {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers ;
    }

    public Customer getCustomer(Long customer_id) {
        return customerRepository.findOne(customer_id);
    }

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void updateCustomer(Long customer_id, Customer customer) {
        customerRepository.save(customer);
    }

//    public Customer getCustomerByAccount(Long account_id,Long customer_id,Customer customer){
//        return customerRepository.findOne(account_id);
//    }

}
