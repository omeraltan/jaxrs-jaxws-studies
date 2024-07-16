package com.rest.formParam;

import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/person-formParam")
public class PersonResourceFormParam {

    // http://localhost:8080/HelloWebApp_war_exploded/api/person-formParam/addPerson
    // output : ömer altan
    @POST
    @Path("/addPerson")
    public String createPerson(@FormParam("name") String name, @FormParam("surname") String surname) {
        return "insert OK...." + name + " " + surname;
    }

}
