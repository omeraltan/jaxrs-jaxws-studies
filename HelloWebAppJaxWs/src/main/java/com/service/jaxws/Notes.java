package com.service.jaxws;

public class Notes {

}

/**
 *
 * Web Service;
 * JAXRS
 * JAXWS -> Java Api For Xml Services (big web services)
 * temel nokta, farklı frameworkler, farklı diller de olsa ortak çalışma / iletişim.
 * JAXWS, XML mesajlarında SOAP yapısını / standardını kullanır.
 * SOAP -> Simple Object Access Protocol
 * JAXRS -> JAVA EE'nin bir parçasıdır.
 *
 * Metro Project, Glassfish(reference implementation)
 * Apache CXF
 * Apache Axis2
 * JBossWS
 * IBM Websphere
 * Oracle Weblogic(application server içerisinde implemantation yer almaktadır.)
 *
 * SOAP, platform bağımsız, XML tabanlı bir standard protokoldür.
 * SOAP mesajları komplex bir yapıya sahiptir. Bununla birlikte developer ların bu komplex yapıyla ğraşmasına gerek yoktur.
 * JAXWS bizim için soap mesajlarını oluşturur/generate ve parse eder.
 *
 * --- WSDL (Web Service Description Language) ---
 * WSDL, XML tabanlı bir dokümandır. Web Service hakkındaki bilgiler bu yapıda yer almaktadır.
 * WSDL, bir service nasıl erişebiliriz, hangi operationları  yapabiliriz bunları tanımlar/gösterir.
 *
 * WSDL (Web Services Description Language), web hizmetlerinin (web services) nasıl erişileceğini ve hangi işlevleri sunduğunu
 * tanımlamak için kullanılan XML tabanlı bir dosya formatıdır.
 * WSDL dosyaları, web hizmetleri sağlayıcıları tarafından oluşturulur ve web hizmetlerini kullanan diğer uygulamalar tarafından okunur.
 *
 * WSDL dosyaları genellikle aşağıdaki bilgileri içerir:
 *
 * 1.Servis Adı ve Adresi     : Hangi servisin tanımlandığı ve nereden erişilebileceği bilgisi.
 * 2.Metodlar (Operasyonlar)  : Web servisinin sunabileceği işlevler veya metodlar, bunların isimleri ve parametre bilgileri.
 * 3.Mesajlar                 : Her metodun alıp vereceği bilgilerin yapısı ve veri tipleri.
 * 4.Bağlantı Bilgileri       : Web servise nasıl bağlanılacağı, kullanılacak iletişim protokolleri ve veri formatları.
 * WSDL, web hizmetlerinin (web services) otomatik olarak kullanılabilmesini sağlar çünkü bu dosya,
 * bir web servisine erişmek ve onunla iletişim kurmak için gerekli tüm teknik detayları içerir.
 * Bu nedenle, WSDL dosyaları, farklı platformlarda ve programlama dillerinde yazılmış uygulamalar arasında
 * etkili bir şekilde iletişim kurulmasını sağlayan önemli bir standart haline gelmiştir.
 *
 * --- WSDL Elemenets ---
 * 1. <definitions>     : WSDL dokümanının root elementidir. Web service in ismini tanımlar. "targetNameSpace", "packageName" ile ilişkilidir.
 * 2. <types>           : Web service'te kullanılan data tiplerini belirtir. String, Integer gibi tipler varsa types elementinde tanımlanmaz. Complex tipler için tanımlanır.
 * Örnek :
 *      <xs:sequence>
 *          <xs:element name="id" type="xs:int"/>
 *          <xs:element name="name" type="xs:string" minOccurs="0"/>
 *          <xs:element name="surname" type="xs:string" minOccurs="0"/>
 *      </xs:sequence>
 * 3. <message>         : Web service de tanımlı methodları ifade etmektedir.
 * 4. <part>            : Bu element input parametrelerini yada dönüş parametresini ifade eder.
 * Örnek :
 *      <message name="getWelcomeMessage">
 *          <part name="name" type="xsd:string"/>
 *          <part name="surname" type="xsd:string"/>
 *      </message>
 *      <message name="getWelcomeMessageResponse">
 *          <part name="return" type="xsd:string"/>
 *      </message>
 * 4. <portType>        : İçerisinde <input>, <output> elementleri yer alır. <message> elementindeki değer ile eşleşir.
 * portType içerisinde tanımlı olan interface, SEI (service endpoint interface)
 * SEI içerisindeki (interface içerisindeki) tanımlı metotlar <operation> etiketi içerisinde yer almaktadır.
 * SEI üzerinde @WebService annotation ı kullanılır.
 * methodları içinde @WebMethod annotation ı kullanılır.
 * 5. <binding>         : Elementi içerisinde soap:binding gibi elementler yer alır. style olarak rpc, document olabilir.
 * 6. <service>         : soap:address elementi yer alır. burada location bilgisi yer alır. web service in publish edileceği address bilgisi.
 *
 */
