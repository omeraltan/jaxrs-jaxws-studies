package com.rest.pathparam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/customer-pathParam")
public class CustomerResourcePathParam {


    // http://localhost:8080/HelloWebApp_war_exploded/api/customer-pathParam/customer/100
    // output : Customer Resource Path Param -> # getCustomerById : 100
    @GET
    @Path("/customer/{id}") // Buradaki part parametresi ile "{id}" method parametresindeki "@PathParam("id")" bilgisi aynı olmak zorundadır.
    public String getCustomerById(@PathParam("id") String customerId) {
        // customer'a göre datayı getir.
        return "Customer Resource Path Param -> # getCustomerById : " + customerId;
    }

}
