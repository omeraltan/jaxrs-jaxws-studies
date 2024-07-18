package com.rest.clientapi;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;

public class MessageClientTest {

    public static void main(String[] args) {
        String URI = "http://localhost:8080/HelloWebApp_war_exploded/api/message-client-api/message";
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(URI);
        Invocation.Builder builder = target.request();
        String message = builder.get(String.class);
        System.out.println(message);
    }

}

/**
 *
 * Client ara birimi, JAX-RS client API nin giriş noktasıdır.
 * Client nesneleri, socket connection açmak / yönetmekten sorumludur.
 * Client nesnelerini ClientBuilder abstract class'ı yardımıyla oluştururuz.
 * WebTarget: Belirttiğimiz "URI" adresini çağırmamızı sağlar.
 *
 */
