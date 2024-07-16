package com.rest.beenparam;

import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/product-beanParam")
public class ProductResourceBeanParam {

    // http://localhost:8080/HelloWebApp_war_exploded/api/product-beanParam/getProduct/computer?productId=1000
    // http://localhost:8080/HelloWebApp_war_exploded/api/product-beanParam/getProduct/computer;brand=apple;price=250.55?productId=1000
    @GET
    @Path("/getProduct/{category}")
    public String getProduct(@BeanParam Product product){
        return "getProduct : " + product.toString();
    }

}
