package com.omer.soapservice.soapcoursemanagement.soap;

import com.omer.soapservice.bean.Course;
import com.omer.soapservice.courses.CourseDetails;
import com.omer.soapservice.courses.GetCourseDetailsRequest;
import com.omer.soapservice.courses.GetCourseDetailsResponse;
import com.omer.soapservice.soapcoursemanagement.soap.service.CourseDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class CourseDetailsEndpoint {

    @Autowired
    CourseDetailsService service;
     // input -> GetCourseDetailsRequest
    // output -> GetCourseDetailsResponse

    @PayloadRoot(namespace = "http://omer.com/soapservice", localPart = "GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {
        GetCourseDetailsResponse response = new GetCourseDetailsResponse();
        Course course = service.findById(request.getId());
        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setId(course.getId());
        courseDetails.setName(course.getName());
        courseDetails.setDescription(course.getDescription());
        response.setCourseDetails(courseDetails);
        return response;
    }


}
