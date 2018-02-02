package com.zcwbank.demo;

import javax.persistence.*;


@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long account_id;
    private Type type;
    private String nickName;
    private Integer rewards;
    private Double balance;
    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer customer;

    public Account(){}

//    public Account(Long id, Enum type, String nickName, Integer rewards, Double balance, Customer customer) {
//        this.id = id;
//        this.type = type;
//        this.nickName = nickName;
//        this.rewards = rewards;
//        this.balance = balance;
//        this.customer = customer;
//    }


    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getRewards() {
        return rewards;
    }

    public void setRewards(Integer rewards) {
        this.rewards = rewards;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_id=" + account_id +
                ", type=" + type +
                ", nickName='" + nickName + '\'' +
                ", rewards=" + rewards +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}
