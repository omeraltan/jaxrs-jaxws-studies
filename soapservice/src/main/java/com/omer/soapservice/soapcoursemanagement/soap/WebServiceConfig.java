package com.omer.soapservice.soapcoursemanagement.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {



    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
        messageDispatcherServlet.setApplicationContext(context);
        messageDispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
    }

    @Bean(name = "courses")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema coursesSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("CoursePort");
        definition.setLocationUri("/ws");
        definition.setTargetNamespace("http://omer.com/soapservice");
        definition.setSchema(coursesSchema);
        return definition;
    }

    @Bean
    public XsdSchema coursesSchema(){
        return new SimpleXsdSchema(new ClassPathResource("example-files/course-details.xsd"));
    }

}

/**
 *
 * Bu konfigürasyon sınıfında, Spring Boot ile bir SOAP web servisi yapılandırılmaktadır. Kodun detaylarını inceleyelim:
 * 1. @EnableWs     : Bu anotasyon, Spring Framework'te SOAP web servislerini etkinleştirir. Spring'in bu sınıfı bir SOAP web servisi yapılandırması olarak tanımasını sağlar.
 * 2. @Configuration: Bu anotasyon, sınıfın bir konfigürasyon sınıfı olduğunu belirtir. Spring, bu sınıfı bir @Bean tanımlarını içerdiği için bir yapılandırma dosyası olarak ele alır.
 * 3. messageDispatcherServlet(ApplicationContext context):
 *      * Bu method, bir MessageDispatcherServlet nesnesi oluşturur. MessageDispatcherServlet, SOAP mesajlarını alıp işlemek için kullanılan bir servlet'tir. Bu servlet, WSDL (Web Services Description Language) belgelerini SOAP istemcilerine sunabilir.
 *      * messageDispatcherServlet.setApplicationContext(context) : Bu satır, servlet'in Spring uygulama bağlamını kullanacak şekilde ayarlanmasını sağlar. Bu, Spring'in servlet'e gerekli bileşenleri enjekte etmesine olanak tanır.
 *      * messageDispatcherServlet.setTransformWsdlLocations(true): Bu ayar, WSDL dosyalarındaki URL'lerin, SOAP servisini barındıran sunucunun URL'sine göre otomatik olarak uyarlanmasını sağlar. Bu, WSDL'deki adreslerin dinamik olarak oluşturulmasını sağlar.
 *      * return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*"): Bu satır, oluşturulan MessageDispatcherServlet'in "/ws/*" desenine uyan URL'lerle eşleştirilmesini sağlar. Yani, bu servlet /ws/ ile başlayan tüm URL isteklerini işleyecektir.
 * Bu yapılandırma sınıfı, Spring Boot uygulamanızda SOAP web servislerinin düzgün bir şekilde çalışmasını sağlamak için gerekli olan temel ayarları yapmaktadır.
 * Bu ayarlarla, WSDL belgeleri ve SOAP istekleri belirli bir URL desenine yönlendirilir ve Spring uygulama bağlamı kullanılarak bu istekler işlenir.
 *
 * DefaultWsdl11Definition Bean Tanımı:
 *      * @Bean(name = "courses")               : Bu anotasyon, Spring'e DefaultWsdl11Definition bean'ini oluşturmasını ve courses adıyla kaydetmesini söyler.
 *      * DefaultWsdl11Definition               : Bu sınıf, SOAP web servisi için bir WSDL (Web Services Description Language) tanımı sağlar. WSDL, SOAP servisini tanımlayan XML tabanlı bir belgedir.
 *      * definition.setPortTypeName("CoursePort"): Bu, WSDL'deki portType adı olarak kullanılacak olan isimdir. Bu isim, servisin çeşitli portlarını tanımlamak için kullanılır.
 *      * definition.setLocationUri("/ws")      : WSDL'nin erişilebilir olacağı URL'nin konumunu belirler. Bu URL, SOAP istemcilerinin servisi bulmak için kullanacağı adrestir.
 *      * definition.setTargetNamespace("http://omer.com/soapservice"): Bu, WSDL içindeki hedef ad alanını (namespace) belirler. Bu ad alanı, servisle ilgili tüm XML elemanlarını tanımlamak için kullanılır.
 *      * definition.setSchema(coursesSchema)   : coursesSchema, servisin XML şemasını (XSD) belirler. Bu, servisin desteklediği veri yapısını tanımlar.
 *
 * XsdSchema Bean Tanımı:
 *      * @Bean                                 : Bu anotasyon, Spring'e XsdSchema bean'ini oluşturmasını söyler. Bu bean, coursesSchema adıyla kaydedilir.
 *      * SimpleXsdSchema                       : Bu sınıf, bir XSD dosyasını kullanarak bir XML şeması tanımlar. SimpleXsdSchema, XSD dosyasının verilerini Spring tarafından kullanılabilir hale getirir.
 *      * new ClassPathResource("course-details.xsd"): Bu, XSD dosyasının classpath içinde bulunduğu yeri belirtir. course-details.xsd, bu konfigürasyonla SimpleXsdSchema'ya yüklenir. Dosya, genellikle src/main/resources dizininde bulunur.
 */
