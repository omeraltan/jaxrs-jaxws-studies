package com.rest.exception;

public class Customer {

    private int id;

    private String name;

    public Customer() {
    }

    public Customer(int i, String bestCustomer) {
        this.id = i;
        this.name = bestCustomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
