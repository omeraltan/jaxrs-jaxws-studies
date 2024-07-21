package com.rest.hateoas;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Link;
import jakarta.ws.rs.core.Response;

@Path("/link-path")
public class LinkService {

    // http://localhost:8181/HelloWebApp_war_exploded/api/link-path/test1
    @GET
    @Path("/test1")
    public Response test1LinkMethod() {
        Link link1 = Link.fromUri("http://localhost:8181/HelloWebApp_war_exploded/api/customers/all").rel("section").type("text/plain").build();
        Link link2 = Link.fromUri("http://localhost:8181/HelloWebApp_war_exploded/api/customers/{id}").rel("self").type("text/plain").build("localhost","1234");
        System.out.println(link1.toString());
        System.out.println(link2.toString());
        Response response = Response.ok("Check Response Header!").links(link1,link2).build();
        return response;
    }
}
