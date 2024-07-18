package com.rest.clientapi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

@Path("/library-client-api")
public class LibraryResource {

    @GET
    @Path("/welcome")
    @Produces(MediaType.TEXT_PLAIN)
    public Response welcome() {
        ResponseBuilder builder = Response.ok("Welcome is invoked!");
        return builder.build();
    }

    @GET
    @Path("/book/{isbn}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBookId(@PathParam("isbn") String isbn) {
        Book book = new Book(isbn, "The new Book");
        ResponseBuilder builder = Response.ok(book);
        return builder.build();
    }


}
