package com.service.jaxws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class CalculatorWebServiceImpl implements CalculatorWebService {

    @WebMethod
    public int add(int a, int b) {
        return a + b;
    }
}
