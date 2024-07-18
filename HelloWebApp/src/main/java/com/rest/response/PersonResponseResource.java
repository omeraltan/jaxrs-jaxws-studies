package com.rest.response;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.GenericEntity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.NewCookie;
import jakarta.ws.rs.core.Response;

import java.util.Arrays;
import java.util.List;

@Path("/person-response")
public class PersonResponseResource {


    // http://localhost:8080/HelloWebApp_war_exploded/api/person-response/name
    @GET
    @Path("/name")
    public Response getEmployeeName(){
        String name = "Ömer";
        Response.ResponseBuilder builder = Response.ok(name);
        builder.header("myHeader", "value");
        builder.cookie(new NewCookie("myCookie","cookieValue"));
        return builder.build();
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/person-response/employees
    @GET
    @Path("/employees")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllEmployees(){
        Employee employee1 = new Employee(100,"testname1","testsurname1");
        Employee employee2 = new Employee(200,"testname2","testsurname2");
        Employee employee3 = new Employee(300,"testname3","testsurname3");
        List<Employee> employees = Arrays.asList(employee1,employee2,employee3);
        return Response.ok(employees).build();
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/person-response/genericEmployees
    @GET
    @Path("/genericEmployees")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllGenericEmployees(){
        Employee employee1 = new Employee(100,"testname1","testsurname1");
        Employee employee2 = new Employee(200,"testname2","testsurname2");
        Employee employee3 = new Employee(300,"testname3","testsurname3");
        List<Employee> employees = Arrays.asList(employee1,employee2,employee3);
        GenericEntity<List<Employee>> genericEntity = new GenericEntity<List<Employee>>(employees) {};
        return Response.ok(genericEntity).build();
    }

}
