package com.rest.clientapi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;

@Path("/message-client-api")
public class MessageClientResource {

    // http://localhost:8080/HelloWebApp_war_exploded/api/message-client-api/message
    @GET
    @Path("/message")
    public String getMesssage(){
        System.out.println("getMessage invoked!");
        return "Hello Client API";
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/message-client-api/messages
    @GET
    @Path("/messages")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getMessages(){
        return Arrays.asList("Message 1", "Message 2", "Message 3");
    }

}
