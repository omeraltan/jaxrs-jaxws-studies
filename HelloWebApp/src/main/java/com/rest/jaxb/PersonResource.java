package com.rest.jaxb;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

@Path("/person-jaxb-xml")
public class PersonResource {

    // http://localhost:8080/HelloWebApp_war_exploded/api/person-jaxb-xml/person
    /** output :
     *
     * <person>
     *  <id>1</id>
     *  <name>Ömer</name>
     *  <surname>Altan</surname>
     * </person>
     *
     */
    @GET
    @Path("/person")
    @Produces(MediaType.APPLICATION_XML)
    public Person getPerson() {
        return new Person(1,"Ömer", "Altan");
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/person-jaxb-xml/personList
    /** output :
     *
     * <people>
     *  <person>
     *      <id>0</id>
     *      <name>test0</name>
     *      <surname>test surname0</surname>
     *  </person>
     *  <person>
     *      <id>1</id>
     *      <name>test1</name>
     *      <surname>test surname1</surname>
     *  </person>
     *  <person>
     *      <id>2</id>
     *      <name>test2</name>
     *      <surname>test surname2</surname>
     *  </person>
     * </people>
     *
     */
    @GET
    @Path("/personList")
    @Produces(MediaType.APPLICATION_XML)
    public List<Person> getPersonList() {
        Person person0 = new Person(0,"test0","test surname0");
        Person person1 = new Person(1,"test1","test surname1");
        Person person2 = new Person(2,"test2","test surname2");
        return Arrays.asList(person0,person1,person2);
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/person-jaxb-xml/personArray
    /**
     * <people>
     *  <person>
     *      <id>0</id>
     *      <name>test0</name>
     *      <surname>test surname0</surname>
     *  </person>
     *  <person>
     *      <id>1</id>
     *      <name>test1</name>
     *      <surname>test surname1</surname>
     *  </person>
     *  <person>
     *      <id>2</id>
     *      <name>test2</name>
     *      <surname>test surname2</surname>
     *  </person>
     * </people>
     */
    @GET
    @Path("/personArray")
    @Produces(MediaType.APPLICATION_XML)
    public Person[] getPersonArray() {
        Person person0 = new Person(0,"test0","test surname0");
        Person person1 = new Person(1,"test1","test surname1");
        Person person2 = new Person(2,"test2","test surname2");
        Person[] persons = new Person[]{person0,person1,person2};
        return persons;
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/person-jaxb-xml/getPersonWithJaxbContext
    /** output :
     *
     * <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
     * <person>
     *     <id>1</id>
     *     <name>test1</name>
     *     <surname>test surname1</surname>
     * </person>
     *
     */
    @GET
    @Path("/getPersonWithJaxbContext")
    @Produces(MediaType.APPLICATION_XML)
    public String getPersonWithJaxbContext() {
        try {
            Person person = new Person(1, "test1", "test surname1");
            JAXBContext context = JAXBContext.newInstance(Person.class);
            StringWriter writer = new StringWriter();
            context.createMarshaller().marshal(person, writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            return "<error>Unable to marshal the Person object.</error>";
        }
    }

}

/**
 *
 * JAXB          -> Java Architecture for XML Binding
 * Marshalling   -> Java nesnelerinin xml'e dönüşmesi işlemidir.
 * Unmarshalling -> xml içeriğinin java nesnelerine döüşmesi işlemidir.
 *
 */
