package com.service.jaxws.serv;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.service.jaxws.serv.TraceWriter")
public class TraceWriterImpl implements TraceWriter {

    @Override
    public String getMessage() {
        return "TraceWriterImpl#getMessage";
    }
}
