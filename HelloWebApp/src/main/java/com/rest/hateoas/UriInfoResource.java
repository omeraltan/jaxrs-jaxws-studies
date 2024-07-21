package com.rest.hateoas;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;

import java.net.URI;

@Path("/uriInfo-path")
public class UriInfoResource {

    // http://localhost:8181/HelloWebApp_war_exploded/api/uriInfo-path/test1
    @GET
    @Path("/test1")
    public String test1UriInfo(@Context UriInfo uriInfo){
        URI requestURI = uriInfo.getRequestUri(); // -> getRequestUri() methodu; absolute URI döner, ek olarak query parametresiyle birlikte
        URI absolutePathURI = uriInfo.getAbsolutePath(); // -> query parametresini dönmez.
        URI baseURI = uriInfo.getBaseUri(); // -> rootPath döner.

        System.out.println(requestURI.toString());
        System.out.println(absolutePathURI.toString());
        System.out.println(baseURI.toString());
        return "UriInfo: " + requestURI.toString() + "\n" + "absolutePathURI: " + absolutePathURI.toString() + "\n" + "baseURI: " + baseURI.toString();
    }

    // http://localhost:8181/HelloWebApp_war_exploded/api/uriInfo-path/test2
    @GET
    @Path("/test2")
    public String test2UriInfo(@Context UriInfo uriInfo){
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.queryParam("startIndex", 10);
        builder.queryParam("endIndex", 20);
        URI uri = builder.build();
        return uri.toString();
    }

}
