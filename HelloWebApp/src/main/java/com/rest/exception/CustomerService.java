package com.rest.exception;

public class CustomerService {

    public Customer findCustomer(int id){
        if (id == 1){
            Customer customer = new Customer(1,"best Customer");
            return customer;
        }
        return null;
    }

}
