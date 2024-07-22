package com.service.jaxws.empservice;

import com.service.jaxws.model.Employee;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface EmployeeService {

    @WebMethod
    public void addEmployee(@WebParam(name = "employee") Employee employee);
    @WebMethod
    public Employee getEmployee(@WebParam(name = "id") int id);
    @WebMethod
    public Employee[] getEmployeesWithArray();

}
