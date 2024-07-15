package com.rest.service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/customer-path")
public class CustomerResource {

    // Her HTTP isteğine karşılık bir tane method tanımlanabilir.
    // Eğer @Path annotation kullanılmayacak ise.
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, Customer!";
    }

    // Her HTTP isteğine karşılık bir tane method tanımlanabilir.
    // Eğer @Path annotation kullanılmayacak ise.
    @POST
    public String helloPost() {
        return "Hello, Customer Post!";
    }

    @GET
    @Path("/greeting")
    public String greeting() {
        return "Customer Resource Greeting";
    }
}
