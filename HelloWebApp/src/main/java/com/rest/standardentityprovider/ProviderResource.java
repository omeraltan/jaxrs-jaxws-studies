package com.rest.standardentityprovider;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.StreamingOutput;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Provider;

@Path("/provider")
public class ProviderResource {

    // http://localhost:8080/HelloWebApp_war_exploded/api/provider/streamingOutput
    // output : streaming Output is invoked!
    @GET
    @Path("/streamingOutput")
    @Produces(MediaType.TEXT_PLAIN) // Dönecek olan datanın tipi belirtilmektedir.
    public StreamingOutput streamingOutput() {
        StreamingOutput output = new StreamingOutput() {
          @Override
          public void write(OutputStream os) throws IOException, WebApplicationException {
              String message = "streaming Output is invoked!";
              os.write(message.getBytes());
          }
        };
        return output;
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/provider/streamingLambdaOutput
    // output : streaming Lambda Output is invoked!
    @GET
    @Path("/streamingLambdaOutput")
    @Produces(MediaType.TEXT_PLAIN)
    public StreamingOutput streamingLamdaOutput() {
        String message = "streaming Lambda Output is invoked!";
        StreamingOutput output = (OutputStream os) -> os.write(message.getBytes());
        return output;
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/provider/byteArray
    // output : byteArray is invoked!
    @GET
    @Path("/byteArray")
    @Produces(MediaType.TEXT_PLAIN)
    public byte[] byteArray() {
        String message = "byteArray is invoked!";
        return message.getBytes();
    }

    // http://localhost:8080/HelloWebApp_war_exploded/api/provider/stringXMLResponse
    /** output :
     * <customer>
     *     <name>John Doe</name>
     * </customer>
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/stringXMLResponse")
    public String stringXMLResponse() {
        String message = "<customer><name>John Doe</name></customer>";
        return message;
    }

}
