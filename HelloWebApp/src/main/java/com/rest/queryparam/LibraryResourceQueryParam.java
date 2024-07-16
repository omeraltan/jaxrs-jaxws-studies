package com.rest.queryparam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;

@Path("/library-queryParam")
public class LibraryResourceQueryParam {

    // http://localhost:8080/HelloWebApp_war_exploded/api/library-queryParam/book?id=100
    // output : get Book By Id : 100
    @GET
    @Path("/book")
    public String getBookById(@QueryParam("id") int id) {
        return "get Book By Id : " + id;
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/library-queryParam/books?start=100&end=200
    // output : get Books : 100 and End : 200
    @GET
    @Path("/books")
    public String getBooks(@QueryParam("start") int start, @QueryParam("end") int end){
        return "get Books : " + start + " and End : " + end;
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/library-queryParam/book-uri-info?id=200
    // output : get Books URI Info : 200
    @GET
    @Path("/book-uri-info")
    public String getBooksURIInfo(@Context UriInfo uriInfo){
        String id = uriInfo.getQueryParameters().getFirst("id");
        return "get Books URI Info : " + id;
    }
}
