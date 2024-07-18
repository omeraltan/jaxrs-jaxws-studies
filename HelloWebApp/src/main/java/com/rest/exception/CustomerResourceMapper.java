package com.rest.exception;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/customer-exception-mapper")
public class CustomerResourceMapper {

    @GET
    @Path("/customer/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@PathParam("id") int id){
        System.out.println("getCustomer is invoked...");
        CustomerService customerService = new CustomerService();
        Customer customer = customerService.findCustomer(id);
        if(customer == null){
            throw new CustomerNotFoundException("Customer with id " + id + " not found");
        }
        return customer;
    }

}
