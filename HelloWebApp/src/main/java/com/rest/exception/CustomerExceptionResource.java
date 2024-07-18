package com.rest.exception;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/customer-exception")
public class CustomerExceptionResource {


    @GET
    @Path("/customer/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@PathParam("id") int id){
        System.out.println("getCustomer is invoked...");
        CustomerService customerService = new CustomerService();
        Customer customer = customerService.findCustomer(id);
        if(customer == null){
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return customer;
    }

}

// javax.ws.rs.WebApplicationException
