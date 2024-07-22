package com.service.jaxws.serv;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;

// full name verilmesi gerekmektedir.
@WebService(endpointInterface = "com.service.jaxws.serv.HelloMyService")
public class HelloMyServiceImpl implements HelloMyService {

    @Override
    public String getWelcomeMessage(String name, String surname) {
        return "Welcome !!!" + name + " " + surname + " This is first example!";
    }
}

// Service Implementation Bean (SIB)
