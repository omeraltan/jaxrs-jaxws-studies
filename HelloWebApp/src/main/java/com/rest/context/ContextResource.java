package com.rest.context;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;

@Path("/context")
public class ContextResource {

    // http://localhost:8080/HelloWebApp_war_exploded/api/context/servletContext
    // output : /HelloWebApp_war_exploded
    @GET
    @Path("/servletContext")
    public String injectServletContext(@Context ServletContext context){
        String contextPath = context.getContextPath();
        return contextPath;
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/context/request
    @GET
    @Path("/request")
    public String injectHttpServletRequest(@Context HttpServletRequest request){
        String pathInfo = request.getPathInfo();
        return pathInfo;
    }


}
