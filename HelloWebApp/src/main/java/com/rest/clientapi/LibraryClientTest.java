package com.rest.clientapi;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

public class LibraryClientTest {

    public static void main(String[] args) {
        String URI = "http://localhost:8080/HelloWebApp_war_exploded/api/library-client-api/welcome";
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(URI);
        Invocation.Builder builder = target.request();

        Response response = builder.get();
        String message = response.readEntity(String.class);
        System.out.println(message);

    }

}
