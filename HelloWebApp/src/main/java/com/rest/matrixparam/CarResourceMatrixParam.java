package com.rest.matrixparam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/car-matrixParam")
public class CarResourceMatrixParam {

    // http://localhost:8080/HelloWebApp_war_exploded/api/car-matrixParam/car;brand=bmw;color=red;color=blue;
    // output : brand : bmw color : [red, blue]
    @GET
    @Path("/car")
    public String getCar(@MatrixParam("brand") String brand, @MatrixParam("color") List<String> color){
        return "brand : " + brand + " color : " + color;
    }

}
