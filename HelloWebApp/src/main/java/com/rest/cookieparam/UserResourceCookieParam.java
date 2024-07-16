package com.rest.cookieparam;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.*;


@Path("/user-cookieParam")
public class UserResourceCookieParam {

    // @CookieParam annotation'ı, cookie lerin enjekte edilmesini sağlamaktadır.
    // http://localhost:8080/HelloWebApp_war_exploded/api/user-cookieParam/addCookie
    // output : addCookie is invoked
    @GET
    @Path("/addCookie")
    public Response addCookie(){
        String resultMessage = "addCookie is invoked";
        Response.ResponseBuilder builder = Response.ok(resultMessage);
        builder.cookie(new NewCookie("cookieParam", "cookieValue"));
        return builder.build();
    }


    // http://localhost:8080/HelloWebApp_war_exploded/api/user-cookieParam/getCookie
    @GET
    @Path("/getCookie")
    public Response getCookie(@CookieParam("cookieName") String cookie){
        String resultMessage = "getCookie is invoked";
        Response.ResponseBuilder builder = Response.ok(resultMessage + " " + cookie);
        return builder.build();
    }

    // "Cookie" 'ler özelleşmiş header bilgileridir.
    // http://localhost:8080/HelloWebApp_war_exploded/api/user-cookieParam/getCookieWithContext
    // output : getCookieWithContextCookie : cookieParam=cookieValue
    @GET
    @Path("/getCookieWithContext")
    public Response getCookieWithContext(@Context HttpHeaders headers){
        String result = "getCookieWithContext";
        for (String name : headers.getCookies().keySet()){
            Cookie cookie = headers.getCookies().get(name);
            result = result + "Cookie : " + cookie.getName() + "=" + cookie.getValue() + "\n";
        }
        Response.ResponseBuilder builder = Response.ok(result);
        return builder.build();
    }
}
