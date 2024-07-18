package com.rest.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<CustomerNotFoundException> {

    @Override
    public Response toResponse(CustomerNotFoundException e) {
        System.out.println("toResponse");
        Response.ResponseBuilder builder = Response.status(Response.Status.NOT_FOUND);
        builder.entity(e.getMessage());
        return builder.build();
    }
}


/**
 *
 * Java servislerde kullanılan ExceptionMapper, Java API for RESTful Web Services (JAX-RS) ile birlikte kullanılan bir bileşendir.
 * ExceptionMapper, RESTful serviste meydana gelen istisnaları (hataları) yakalamak ve bu hatalara uygun HTTP yanıtları döndürmek için kullanılır.
 * Bu sayede, uygulamanızın hata yönetimini merkezi bir şekilde yapabilirsiniz.
 *
 * @Provider : Bu anotasyon, sınıfın bir ExceptionMapper olarak kullanılacağını belirtir.
 * toResponse methodu : Yakalanan istisna ile ilgili HTTP yanıtını oluşturur.
 *
 * Hata mesajlarını özelleştirme: Hataları daha anlaşılır hale getirmek için yanıt içeriğini özelleştirebilirsiniz.
 * Hata kodları yönetimi        : HTTP durum kodlarını belirleyerek, istemcilere daha anlamlı yanıtlar sunabilirsiniz.
 *
 */
