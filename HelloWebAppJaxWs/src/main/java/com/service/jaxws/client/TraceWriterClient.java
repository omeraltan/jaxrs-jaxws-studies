package com.service.jaxws.client;

import com.service.jaxws.serv.TraceWriter;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class TraceWriterClient {

    public static void main(String[] args) throws MalformedURLException {
        String wsdlURL = "http://localhost:8181/jaxws/trace/";
        URL url = new URL(wsdlURL);
        QName qname = new QName("http://service.jaxws.service", "TraceService");
        Service service = Service.create(url, qname);

        TraceWriter traceWriter = service.getPort(TraceWriter.class);
        System.out.println(traceWriter.getMessage());
    }

}
