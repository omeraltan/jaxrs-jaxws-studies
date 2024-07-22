package com.service.jaxws.client;

import com.service.jaxws.serv.HelloMyService;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ClientTest {

    public static void main(String[] args) throws MalformedURLException {
        String address = "http://localhost:8181/week01/hello.service";
        URL url = new URL(address);
        QName qname = new QName("http://com.service.jaxws.serv/", "HelloMyService");
        Service service = Service.create(url, qname);

        HelloMyService hello = service.getPort(HelloMyService.class);
        String message = hello.getWelcomeMessage("test name", "test surname");
        System.out.println(message);
    }

}
