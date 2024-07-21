package com.service.jaxws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface CalculatorWebService {
    @WebMethod
    int add(int a, int b);
}
