package com.omer.soapservice.courses;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;
import java.io.StringWriter;

public class JaxbTest {

    public static void main(String[] args) {
        try {
            // Java Nesnesini XML'e Çevirme (Marshalling)
            GetCourseDetailsRequest request = new GetCourseDetailsRequest();
            request.setId(123);

            JAXBContext jaxbContext = JAXBContext.newInstance(GetCourseDetailsRequest.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            StringWriter xmlWriter = new StringWriter();
            marshaller.marshal(request, xmlWriter);

            String xmlOutput = xmlWriter.toString();
            System.out.println("Marshalled XML:\n" + xmlOutput);

            // XML'i Java Nesnesine Çevirme (Unmarshalling)
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader xmlReader = new StringReader(xmlOutput);
            GetCourseDetailsRequest unmarshalledRequest = (GetCourseDetailsRequest) unmarshaller.unmarshal(xmlReader);

            System.out.println("Unmarshalled ID: " + unmarshalledRequest.getId());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
