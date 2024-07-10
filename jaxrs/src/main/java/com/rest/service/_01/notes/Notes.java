package com.rest.service._01.notes;

public class Notes {



}

/**
 * ------------------- Notes -------------------
 * Web Service ler farklı uygulamaların birlikte çalışmasına olanak sağlar.
 * Anahtar Kelimemiz -> interoperating kavramı (birlikte çalışma)
 * Farklı programlama dilide olsa yada farklı frameworkler de olsa fark etmez.
 * 2 tane uygulama birbiri ile veri değişimi (data exchange) sağlayabilir.
 * Dışarıya public bir hizmet açılabilir.
 * Hava durumu, currency, ip location web service, twitter, amazon vb.
 * Müşteriye sağlanan web hizmetleri;
 * Web service yardımıyla kendi bilgilerini parametre olarak vererek, transaction, order vs bilgilerini görebilir.
 *
 * Java da 2 (iki) tip "web service" vardır:
 * 1 - JAX-RS
 * 2 - JAX-WS
 * JAX-RS ve JAX-WS, Java EE'nin bir parçasıdır.
 * ---------------------------------------------
 * JAX-RS: Java API for RESTful web service
 * JAX-RS, HTTP Protokolü üzerinden RESTful Web Servisleri için bir Java API Sağlayan, yeni bir JCP spesifikasyonudur.
 * Çeşitli JAX-RS implementasyonları vardır.
 * 1 - "Jersey"
 * 2 - "RESTEasy"
 * 3 - "Restlet"
 * 4 - "Apache CXF"
 *
 * REST kavramı; "Representation State Transfer" anlamına gelmektedir. 2000 yili , Roy Fielding , doktora tezinden ortaya cikmistir.
 * (http://www.ics.uci.edu/~fielding/pubs/dissertation/top.htm)
 *
 * ------  RESTFul Architectural principles  ------
 *
 * 1 - Addressability/Addressable resources
 *  a - Kaynaklara (resource) erisim unique/tekil bir identier ile ulasilabilir olmalidir.
 *  b - Her kaynak, URI(uniform resource identifier) ile adreslenebilir olmalidir.
 *  c - scheme://host:port/path?queryString#fragment
 *      scheme -> kullanilan protocol , http , https , ftp
 *      host -> dns adi ya ip adresi olabilir
 *      port -> optional
 *      path ve queryString
 *  d - Örneğin : http://example.com/customers?lastName=Omer&zipcode=34000
 *  e - Addressability is the idea that every object and resource in your system is reachable through a unique identifier.
 *  f - Each resource must be addressable via a URI (Uniform Resource Identifier).
 *
 * 2 - Representation Oriented
 *  a - representation -> XML , JSON gibi formatlar araciligiyla exchange ediyoruz.
 *  b - HTTP GET istediginde bulunduguumuzda , ilgili kaynagin mevcut durumunu/ representation íni aliriz.
 *
 * 3 - The Uniform, Constrained Interface
 *  a - This means that you don’t have an “action” parameter in your URI and use only the methods of HTTP for your web services.
 *  b - uri bilgiinsde bir action paremetresi gonderip, bu parametreye gore akis kontrolu YAPMA!
 *
 *  GET    : server dan bir kaynak/resource isteĞinde bulundugumuzda GET'i kullaniriz.
 *  idempotent : Bir islem/istek/operation yaptigimizda, bunu kac defa yaptigimizn bir onemi yoktur. Sonuç her zaman aynıdır.
 *  GET doğası geregi idempotent ozellik gosterir.
 *
 *  POST   : non-idempotent özlelliğe sahiptir. İşlemi kaç defa uyguladığımız önemlidir, her defasında sonuç değişecektir.
 *  Create resource, post için uygun olacaktır.
 *
 *  PUT    : update/güncelleme amacıyla tercih edilir. PUT da, GET gibi idempotent özelliğe sahiptir.
 *  Bir dosyayı bir kez kaydettiğimizde (update) kayıt işlemi yapılır. Sonrasındaki kaydetme işlemleri (değişiklik yapılmadığında) bir şey ifade etmez.
 *  PUT un mantığı bu şekilde çalışmaktadır.
 *
 *  DELETE : idempotent özellik gösterir.
 *
 */
