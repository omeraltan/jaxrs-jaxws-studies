package com.rest.clientapi;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.Response;

public class WorkerClientTest2 {

    public static void main(String[] args) {
        String URI = "http://localhost:8080/HelloWebApp_war_exploded/api/worker-client-api/addWorkerXML";
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(URI);
        Entity<Worker> xmlEntity = Entity.xml(new Worker(1,"Ömer","Altan"));
        Invocation.Builder builder = target.request();
        Response message = builder.post(xmlEntity);
        System.out.println(message.readEntity(String.class));
    }

}
