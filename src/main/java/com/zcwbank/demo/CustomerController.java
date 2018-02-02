package com.zcwbank.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    public CustomerServices customerServices;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers(){return customerServices.getAllCustomers(); }

    @RequestMapping("/customers/{customer_id}")
    public Customer getCustomer(@PathVariable Long customer_id){
        return  customerServices.getCustomer(customer_id);}

    @RequestMapping(method = RequestMethod.POST, value = "/customers")
    public void addCustomer(@RequestBody Customer customer){customerServices.addCustomer(customer);}

    @RequestMapping(method = RequestMethod.PUT, value = "/customers/{customer_id}")
    public void updateCustomer(@RequestBody Customer customer,@PathVariable Long customer_id){customerServices.updateCustomer(customer_id,customer);}
}
