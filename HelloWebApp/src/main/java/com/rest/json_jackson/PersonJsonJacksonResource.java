package com.rest.json_jackson;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/person-json")
public class PersonJsonJacksonResource {

    // http://localhost:8080/HelloWebApp_war_exploded/api/person-json/person
    /** output :
     *
     * {
     *   "id": 1,
     *   "name": "Ömer",
     *   "surname": "Altan"
     * }
     *
     */
    @GET
    @Path("/person")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson() {
        return new Person(1,"Ömer", "Altan");
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/person-json/personList
    /** output :
     * [
     *     {
     *         "id": 0,
     *         "name": "test0",
     *         "surname": "test surname0"
     *     },
     *     {
     *         "id": 1,
     *         "name": "test1",
     *         "surname": "test surname1"
     *     },
     *     {
     *         "id": 2,
     *         "name": "test2",
     *         "surname": "test surname2"
     *     }
     * ]
     */
    @GET
    @Path("/personList")
    @Produces(MediaType.APPLICATION_JSON)
    public List<com.rest.jaxb.Person> getPersonList() {
        com.rest.jaxb.Person person0 = new com.rest.jaxb.Person(0,"test0","test surname0");
        com.rest.jaxb.Person person1 = new com.rest.jaxb.Person(1,"test1","test surname1");
        com.rest.jaxb.Person person2 = new com.rest.jaxb.Person(2,"test2","test surname2");
        return Arrays.asList(person0,person1,person2);
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/person-json/personArray
    /**
     * [
     *   {
     *     "id": 0,
     *     "name": "test0",
     *     "surname": "test surname0"
     *   },
     *   {
     *     "id": 1,
     *     "name": "test1",
     *     "surname": "test surname1"
     *   },
     *   {
     *     "id": 2,
     *     "name": "test2",
     *     "surname": "test surname2"
     *   }
     * ]
     */
    @GET
    @Path("/personArray")
    @Produces(MediaType.APPLICATION_JSON)
    public com.rest.jaxb.Person[] getPersonArray() {
        com.rest.jaxb.Person person0 = new com.rest.jaxb.Person(0,"test0","test surname0");
        com.rest.jaxb.Person person1 = new com.rest.jaxb.Person(1,"test1","test surname1");
        com.rest.jaxb.Person person2 = new com.rest.jaxb.Person(2,"test2","test surname2");
        com.rest.jaxb.Person[] persons = new com.rest.jaxb.Person[]{person0,person1,person2};
        return persons;
    }

}
