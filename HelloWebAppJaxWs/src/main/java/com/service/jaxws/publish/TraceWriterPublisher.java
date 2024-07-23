package com.service.jaxws.publish;

import com.service.jaxws.serv.TraceWriterImpl;
import jakarta.xml.ws.Endpoint;

public class TraceWriterPublisher {

    private static final String address = "http://localhost:8181/jaxws/tracewriter";

    public static void main(String[] args) {
        Endpoint.publish(address, new TraceWriterImpl());
        System.out.println("Web Service is publishing...");
    }

}
