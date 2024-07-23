package com.service.jaxws.serv;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TraceWriter {

    @WebMethod
    public String getMessage();

}
