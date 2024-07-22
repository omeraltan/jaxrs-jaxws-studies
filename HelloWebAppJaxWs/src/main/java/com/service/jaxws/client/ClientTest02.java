package com.service.jaxws.client;

import com.service.jaxws.empservice.EmployeeService;
import com.service.jaxws.model.Employee;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class ClientTest02 {

    public static void main(String[] args) throws MalformedURLException {
        System.out.println("ClientTest02 start");
        String address = "http://localhost:8181/HelloWebAppJaxWs_war_exploded/employeeServiceWS?wsdl";
        URL url = new URL(address);
        QName qname = new QName("http://empservice.jaxws.service.com/", "EmployeeServiceImplService");
        Service service = Service.create(url, qname);

        EmployeeService employeeService = service.getPort(EmployeeService.class);
        Employee employee1 = new Employee(1,"omer", "altan",5000);
        Employee employee2 = new Employee(2,"ebru", "altan",7000);

        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);

        Employee emp = employeeService.getEmployee(1);
        System.out.println(emp);

        Employee[] empArray = employeeService.getEmployeesWithArray();
        Arrays.asList(empArray).forEach(System.out::println);
    }

}
