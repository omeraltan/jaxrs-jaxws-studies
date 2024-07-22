package com.service.jaxws.serv;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC) // -> Varsayılan olarak DOCUMENT'tir.
public interface HelloMyService {

    @WebMethod
    public String getWelcomeMessage(@WebParam(name = "userName") String name, @WebParam(name = "userSurname") String surname);


}
