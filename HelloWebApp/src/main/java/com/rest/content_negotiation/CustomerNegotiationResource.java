package com.rest.content_negotiation;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/customer-root")
public class CustomerNegotiationResource {

    // http://localhost:8181/HelloWebApp_war_exploded/api/customer-root/hello
    @GET
    @Path("/hello")
    public String hello() {
        return "It is works!";
    }

    // http://localhost:8181/HelloWebApp_war_exploded/api/customer-root/customer
    // Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
    @GET
    @Path("/customer")
    @Produces(MediaType.TEXT_HTML)
    public Customer getCustomerText(){
        System.out.println("TEXT_HTML");
        return new Customer(1,"Omer_TEXT");
    }

    // http://localhost:8181/HelloWebApp_war_exploded/api/customer-root/customer
    // Accept: application/json
    @GET
    @Path("/customer")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomerJSON(){
        System.out.println("APPLICATION_JSON");
        return new Customer(1,"Omer_JSON");
    }

    // http://localhost:8181/HelloWebApp_war_exploded/api/customer-root/customer
    // Accept: application/xml
    @GET
    @Path("/customer")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomerXML(){
        System.out.println("APPLICATION_XML");
        return new Customer(1,"Omer_XML");
    }

    // http://localhost:8181/HelloWebApp_war_exploded/api/customer-root/customerFormat
    // Accept: application/xml, application/json;q=0.6 -> Burada öncelik, "application/xml" 'dir. Defalt olarak "q" değeri 1.0'dır.
    // Accept: application/xml;q=0.3, application/json;q=0.6 -> Burada öncelik, "application/json" 'dır. Çünkü "q" değeri daha büyüktür.
    @GET
    @Path("/customerFormat")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Customer getCustomerFormat(){
        System.out.println("APPLICATION_XML OR APPLICATION_JSON");
        return new Customer(1,"Omer_XML OR Omer_JSON");
    }

}
