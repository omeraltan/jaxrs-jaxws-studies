package com.rest.clientapi;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/worker-client-api")
public class WorkerResource {

    // http://localhost:8080/HelloWebApp_war_exploded/api/worker-client-api/addWorker
    @POST
    @Path("/addWorker")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String addWorker(Worker worker){
        //
        //
        System.out.println("addWorker is called.");
        System.out.println(worker);
        return "worker added successfully";
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/worker-client-api/addWorker
    @POST
    @Path("/addWorkerXML")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String addWorkerXML(Worker worker){
        //
        //
        System.out.println("addWorkerXML is called.");
        System.out.println(worker);
        return "worker added successfully";
    }

}
