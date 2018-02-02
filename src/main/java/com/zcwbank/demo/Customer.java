package com.zcwbank.demo;
//import com.sun.jndi.cosnaming.IiopUrl;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long customer_id;


    public String first_name;


    public String last_name;

    @OneToMany(cascade = CascadeType.ALL)
    public Set<Address> address;


    public Customer(){
    }

//    public Customer(String first_name, String last_name, Set<Address> address) {
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.address = address;
//    }


    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address=" + address +
                '}';
    }
}


