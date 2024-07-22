package com.service.jaxws.publish;

import com.service.jaxws.serv.HelloMyServiceImpl;
import jakarta.xml.ws.Endpoint;

public class Publisher {

    public static void main(String[] args) {
        String address = "http://localhost:8181/week01/hello.service";
        Endpoint.publish(address ,new HelloMyServiceImpl());
        System.out.println("Web service is running...");
    }

}
