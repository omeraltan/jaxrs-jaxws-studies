package com.rest.encoded;

import jakarta.ws.rs.Encoded;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/employee-encoded")
public class EmployeeResource {

    // http://localhost:8080/HelloWebApp_war_exploded/api/employee-encoded/greeting
    // output : Hello Jax-RS week3
    @GET
    @Path("/greeting")
    public String getGreetingMessage(){
        return "Hello Jax-RS week3";
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/employee-encoded/getEmployeeNameEncoded?name=Ömer
    // output : %C3%96mer
    @GET
    @Path("/getEmployeeNameEncoded")
    public String getEmployeeNameEncoded(@Encoded @QueryParam("name") String name){
        return name;
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/employee-encoded/getEmployeeName?name=Ömer
    // output : Ömer
    @GET
    @Path("/getEmployeeName")
    public String getEmployeeName(@QueryParam("name") String name){
        return name;
    }

}
