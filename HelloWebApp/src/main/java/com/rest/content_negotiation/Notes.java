package com.rest.content_negotiation;

public class Notes {



}

/**
 *
 * Negotiation -> uzlaşma
 * Content Negotiation -> Conneg
 * Web service hizmetini farklı farklı client lar kullanabilir.
 * Bir müşteri/client data'yı XML olarak isteyebilir. Dğer bir müşteri JSON olarak, bir başkası YAML formatında data'yı isteyebilir.
 * Bu durumda, her bir response type için dublicate code yazmak yerine bunu flexible/esnek şekilde çözümleyebiliriz.
 *
 * client / browser -> server ile iletişimi HTTP ile sağlamaktadır.
 * client bir header ekler, Accept header'ı
 * client tercih ettiği header bilgisini Accept header ile server'a gmnderir.
 *
 * GET http://example.com/stuff
 * Accept: application/xml, application/json
 *
 * Bu durumda client serverdan data formatı olarak cevap/response olarak XML veya JSON beklemektedir.
 * Eğer server bu formatı desteklemiyorsa bu durumda HTTP 406 Not Acceptable dönecektir.
 *
 */

// "q type" öncelik sıraları

// Örnek-1:
// GET http://example.com/stuff
// Accept: text/*, text/html;level=1, */*, application/xml

// 1. text/html;level=1
// 2. application/cml
// 3. text/*
// 4. */*

// Örnek-2:
// GET http://example.com/stuff
// Accept: text/*;q=0.9, */*;q=0.1, audio/mpeg, application/xml;q=0.5
// q -> MIME type property
// 0.0 - 1.0 arasında değilse default değer 1.0'dır.

// 1. audio/mpeg (burda q -> MIME type yazılmadığı için default olarak 1.0 kabul edilir.)
// 2. text/*;q=0.9 (burada q -> MIME type büyük olduğu için sıralamada ikinci sıradadır.)
// 3. application/xml;q=0.5
// 4. */*;q=0.1
