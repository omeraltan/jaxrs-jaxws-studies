package com.rest.response;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/http-response")
public class HttpResponseResource {

    // http://localhost:8080/HelloWebApp_war_exploded/api/http-response/response200
    // http protokolünde başarılı response code ları [200-399] aralığında yer alır.
    @GET
    @Path("/response200")
    public String response200() {
        return "hello response 200";
    }

    // http: http://localhost:8080/HelloWebApp_war_exploded/api/http-response/responseNull
    // Dönüş null yada method void ise bu durumda HTTP "204 No Content" code döner.
    @GET
    @Path("/responseNull")
    public String responseNull(){
        return null;
    }

    // http: http://localhost:8080/HelloWebApp_war_exploded/api/http-response/response405
    @POST
    @Path("/response405")
    public String response405(){
        return "response 405 is invoked!";
    }

}

/**
 *
 * HTTP'de hata kodları [400-599] aralığında yer alırlar.
 *
 * 404 : NOT FOUND
 * 405 : NOT ALLOWED
 *
 *
 */
