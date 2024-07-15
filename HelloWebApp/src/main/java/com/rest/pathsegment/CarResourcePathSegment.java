package com.rest.pathsegment;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.PathSegment;

import java.util.List;

@Path("/car-pathSegment")
public class CarResourcePathSegment {

    // matrix parametresi genel formatı : .../path/matrixParam=value; matrixParam2=value2; matrixParam3=value3
    // http://localhost:8080/HelloWebApp_war_exploded/api/car-pathSegment/car/criteria;brand=bmw;color=red;color=blue
    // output : brand : bmw color : [red, blue]
    @GET
    @Path("/car/{search : criteria}")
    public String getCar(@PathParam("search") PathSegment pathSegment){
        String brand = pathSegment.getMatrixParameters().getFirst("brand");
        List<String> colors = pathSegment.getMatrixParameters().get("color");
        return "brand : " + brand + " color : " + colors;
    }

}
