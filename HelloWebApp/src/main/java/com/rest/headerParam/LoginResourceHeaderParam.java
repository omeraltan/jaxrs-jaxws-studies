package com.rest.headerParam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;

@Path("/login-headerParam")
public class LoginResourceHeaderParam {

    // @HeaderParam anotasyonu header ları eşleştirmek için kullanılmaktadır.
    // @HeaderParam anotasyonu ile header bilgilerini inject edebiliriz.
    // http://localhost:8080/HelloWebApp_war_exploded/api/login-headerParam/userAgent
    // output postman : userAgent : PostmanRuntime/7.37.3
    // output mozilla : userAgent : Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36
    @GET
    @Path("/userAgent")
    public String getUserAgent(@HeaderParam("user-agent") String userAgent){
        return "userAgent : " + userAgent;
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/login-headerParam/headerInformation
    @GET
    @Path("/headerInformation")
    public String getHeadersInformation(@Context HttpHeaders headers){
        String message = "";
        for (String headerName : headers.getRequestHeaders().keySet()){
            message = message + "<br/>" + headerName + " : " + headers.getRequestHeader(headerName);
        }
        return message;
    }

}
