package com.rest.service;

public class Notes {



}

/**
 *
 * Web Service ler farklı uygulamaların birlikte çalımasına olanak sağlarlar.
 * inter operating : farklı frameworkler de olsa fark etmez.
 * iki ayrı uygulama birbiri ile veri değişimi (data change) sağlamak amacıyla web service leri kullanabilir.
 * Bunun dışında dışarıya public bir hizmet açılabilir. Örneğin: hava durumu, currency, ip location web service, twitter, amazon ws
 * Müşteriye sağlanan web servic leri vb.
 * Web service yardımıyla kendi bilgilerini parametre olarak vererek, transaction, order vb. bilgilerini görebilir.
 * ----------------------------------------
 * Javada 2 (iki) tip web service vardır (JAX-RS, JAX-WS).
 * JAX-RS ve JAX-WS, Java EE'nin bir parçasıdır/bölümüdür.
 * JAX-RS : "Java API for RESTful services"
 * JAX-RS 2.0, JSR-339, HTTP Protokolü üzerinden RESTful Web Serviceleri için bir Java API sağlayan yeni bir JCP sipesifikasyonudur.
 * Çeşitli JAX-RS implementasyonları vardır:
 * 1 - Jersey (*)
 * 2 - RESTEasy (*)
 * 3 - Restlet
 * 4 - Apache CXF
 *
 * REST : 2000 yılında "Roy Fielding"'in doktora tezinden ortaya çıkmıştır. "Representation State Transfer" anlamına gelmektedir.
 * --- RESTful Architechtural Principles ---
 * 1 - Addressability / Addressable resources
 *  a - Kaynaklara erişim "unique" bir identifier ile ulaşılabilir olmalıdır.
 *  b - Her kaynak, URI(Uniform Resource Identifier) ile adreslenebilir olmalıdır.
 *  c - scheme://host:port/path?queryString#Fragment
 *          i   - scheme -> kullanılan protokol, http, https, ftp
 *          ii  - host   -> dns adı yada ip adresi olabilir.
 *          iii - port   -> optional
 *          iv  - path ve queryString
 *  d - Tekil bir identifier ile bütün nesneler, resource lar ulaşılabilir olmalıdır.
 *
 * 2 - Representation Oriented
 *  a - xml, json gibi formatlar representation olmaktadır.
 *  b - xml, json gibi formatlar aracılığı ile exchange edilmektedir.
 *  c - HTTP GET isteğinde bulunduğumuzda ilgili kaynağın mecvut durumunu (representation'ı) alırız.
 *
 * 3 - The Uniform, Constrained Interface
 *  a - Bu yaklaşım URI bilgisinde bir action parametresi gönderip, parametreye göre akış kontrolü yapılmaması gerektiğini söylemektedir.
 *
 * GET      : Server lardan bir resource isteğinde bulunduğumuzda GET'i kullanmaktayız. Idempotent'dır.
 * Bir methoddan veri istendiğinde her seferinde aynı sonucu döndürmesine idempotent denmektedir.
 * Bir işlem, istek, operation yaptığımızda, bunun kaç defa yaptığımızın önemi yoktur. Sonuç her zaman aynıdır.
 * GET, doğası gereği idempotent özellik gösterir.
 *
 * POST     : non-idempotent özelliğe sahiptir. İşlemi kaç defa uyguladığımız önemlidir. Her defasında sonuç değişecektir.
 * Create resource, post için uygun olacaktır.
 *
 * PUT      : idempotent özelliğe sahiptir. Update amacıyla tercih edilir.
 * Bir dosyayı bir kez kaydettiğimizde update olur. Değişiklik yapmdadn kaydetme işlemi bir şey ifade etmez. Bu nedenle idempotent özellik gösterir.
 *
 * DELETE   : idempotent özelliğe sahiptir. Silme amacıyla tercih edilir.
 *
 */
