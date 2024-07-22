package com.service.jaxws.empservice;

import com.service.jaxws.model.Employee;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@WebService(endpointInterface = "com.service.jaxws.empservice.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

    public static List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void addEmployee(Employee employee) {
        System.out.println("add Employee is invoked!");
        employees.add(employee);
        System.out.println(employees);
    }

    @Override
    public Employee getEmployee(int id) {
        Predicate<Employee> predicate = e -> e.getId() == id;
        return employees.stream().filter(predicate).findAny().orElse(null);
    }

    @Override
    public Employee[] getEmployeesWithArray() {
        return employees.toArray(new Employee[employees.size()]);
    }
}
