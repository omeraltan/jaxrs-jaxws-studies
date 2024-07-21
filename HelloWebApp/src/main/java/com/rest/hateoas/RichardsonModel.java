package com.rest.hateoas;

public class RichardsonModel {



}

/**
 *
 * Richardson modelinde 3 tane faktor RESTFul web servicelerin gelişmişlik/olgunluk seviyesini belirtir.
 *
 * URI (Uniform resource identifier)
 * HTTP methods
 * Hypermedia
 *
 * Level Zero   : Bu level'in tipik özelliği; single URI, single method. Servisin tek bir giriş noktası ve tek bir method kullanılmaktadır (genellikle http post).
 * Level One    : Bu level'in tipik özelliği; multiple URI, single method. Burada birden fazla URI var fakat yine tek tip method yer almaktadır (HTTP POST).
 * Level Two    : Bu level'in tipik özelliği; multiple URI, multiple methods. Burada birden fazla URI, birden fazla method yer almaktadır (HTTP GET, UPDATE, POST, DELETE).
 * Level Three  : Bu level'in tipik özelliği; multiple URI, multiple methods, hyper media/hateoas
 *
 */
