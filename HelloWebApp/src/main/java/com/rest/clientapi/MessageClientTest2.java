package com.rest.clientapi;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;

import java.util.List;

public class MessageClientTest2 {

    public static void main(String[] args) {
        String URI = "http://localhost:8080/HelloWebApp_war_exploded/api/message-client-api/messages";
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(URI);
        Invocation.Builder builder = target.request();
        List<String> returnList = builder.get(new GenericType<List<String>>() {});
        System.out.println(returnList);
    }

}
