package com.rest.clientapi;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.Response;

public class WorkerClientTest {

    public static void main(String[] args) {
        String URI = "http://localhost:8080/HelloWebApp_war_exploded/api/worker-client-api/addWorker";
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(URI);
        Entity<Worker> jsonEntity = Entity.json(new Worker(1,"Ömer","Altan"));
        Invocation.Builder builder = target.request();
        Response message = builder.post(jsonEntity);
        System.out.println(message.readEntity(String.class));
    }

}
