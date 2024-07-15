package com.rest.pathparam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.time.LocalDate;

@Path("/order-pathParam")
public class OrderResourcePathParam {

    // Birden fazla path param bilgisi kullanabiliriz.
    // http://localhost:8080/HelloWebApp_war_exploded/api/order-pathParam/order/16/08/2017
    // output : 2017-08-16
    @GET
    @Path("/order/{day}/{month}/{year}")
    public String getOrderByDate(@PathParam("day") int day, @PathParam("month") int month, @PathParam("year") int year){
        LocalDate date = LocalDate.of(year, month, day);
        return date.toString();
    }

    // regex ile ilgili parametre alanını kontrol edebilirsiniz. "\\d+"
    // http://localhost:8080/HelloWebApp_war_exploded/api/order-pathParam/orderById/100
    // output : get Order By Id: 100
    @GET
    @Path("/orderById/{id : \\d+}")
    public String getOrderById(@PathParam("id") int id){
        return "get Order By Id: " + id;
    }

    // regex ile burada parametre alınırken "Order" ile başlasın,
    // tire "-" gelisn ve sonra bir nümerik ifade ve herhangi bir ifade gelsin denmektedir.
    // http://localhost:8080/HelloWebApp_war_exploded/api/order-pathParam/orderByName/Order-100A
    // output : get Order By Name: Order-100A
    @GET
    @Path("/orderByName/{name: Order-\\d+\\w+}")
    public String getOrderByName(@PathParam("name") String name){
        return "get Order By Name: " + name;
    }
}
