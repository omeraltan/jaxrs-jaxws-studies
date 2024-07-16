package com.rest.defaultvalue;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/car-defaultValue")
public class CarResourceDefaultValue {

    // http://localhost:8080/HelloWebApp_war_exploded/api/car-defaultValue/car
    // output : get Car By Id : 0 (@DefaultValue annotation eklenmeden önceki halidir.)
    // http://localhost:8080/HelloWebApp_war_exploded/api/car-defaultValue/car
    // output : get Car By Id : 1000 (@DefaultValue annotation eklendikten sonraki halidir.)
    @GET
    @Path("/car")
    public String getCarById(@DefaultValue ("1000") @QueryParam("id") int id){
        return "get Car By Id : " + id;
    }
}
