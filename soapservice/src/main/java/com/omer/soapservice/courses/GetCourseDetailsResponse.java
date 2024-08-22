package com.omer.soapservice.courses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CourseDetails" type="{http://in28minutes.com/courses}CourseDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "courseDetails"
})
@XmlRootElement(name = "GetCourseDetailsResponse", namespace = "http://omer.com/soapservice")
public class GetCourseDetailsResponse {

    protected CourseDetails courseDetails;

    /**
     * Gets the value of the courseDetails property.
     *
     * @return
     *     possible object is
     *     {@link CourseDetails }
     *
     */
    public CourseDetails getCourseDetails() {
        return courseDetails;
    }

    /**
     * Sets the value of the courseDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link CourseDetails }
     *
     */
    public void setCourseDetails(CourseDetails value) {
        this.courseDetails = value;
    }

}
