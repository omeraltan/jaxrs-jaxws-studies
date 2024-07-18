package com.rest.json_jackson;

import com.rest.jaxb.Address;
import com.rest.jaxb.Customer;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/customer-json")
public class CustomerAddressJsonJacksonResource {

    // http://localhost:8080/HelloWebApp_war_exploded/api/customer-json/customer
    /** output :
     * {
     *   "id": 1,
     *   "name": "Ömer",
     *   "address": {
     *     "city": "Ankara",
     *     "zip": "34000"
     *   }
     * }
     */
    @GET
    @Path("/customer")
    @Produces(MediaType.APPLICATION_JSON)
    public com.rest.jaxb.Customer getCustomer() {
        Address address = new Address("Ankara","34000");
        return new Customer(1, "Ömer",address);
    }
}
