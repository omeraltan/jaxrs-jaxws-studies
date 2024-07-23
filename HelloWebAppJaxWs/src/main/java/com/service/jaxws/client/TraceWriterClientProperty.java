package com.service.jaxws.client;

import com.service.jaxws.serv.TraceWriter;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class TraceWriterClientProperty {

    public static void main(String[] args) throws MalformedURLException {
        String wsdlURL = "http://localhost:8181/HelloWebAppJaxWs_war_exploded/traceWriterWS?wsdl";
        // property eklediğimizde soap mesajlarını trace edebiliriz.
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        URL url = new URL(wsdlURL);
        QName qname = new QName("http://serv.jaxws.service.com/", "TraceWriterImplService");
        Service service = Service.create(url, qname);
        TraceWriter traceWriter = service.getPort(TraceWriter.class);
        System.out.println(traceWriter.getMessage());
    }

}
