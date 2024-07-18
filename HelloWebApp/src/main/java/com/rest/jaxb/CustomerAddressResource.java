package com.rest.jaxb;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/customer-jaxb-xml")
public class CustomerAddressResource {

    // http://localhost:8080/HelloWebApp_war_exploded/api/customer-jaxb-xml/customer
    /** output :
     * <customer>
     *  <address>
     *      <city>Ankara</city>
     *      <zip>34000</zip>
     *  </address>
     *      <id>1</id>
     *      <name>Ömer</name>
     * </customer>
     */
    @GET
    @Path("/customer")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomer() {
        Address address = new Address("Ankara","34000");
        return new Customer(1, "Ömer",address);
    }
}
