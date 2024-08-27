package com.omer.data.jpahibernate.course;

import com.omer.data.jpahibernate.course.jdbc.CourseJdbcRepository;
import com.omer.data.jpahibernate.course.jpa.CourseJpaRepository;
import com.omer.data.jpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //@Autowired
    //private CourseJdbcRepository repository;
    //@Autowired
    //private CourseJpaRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Java", "Java Programming"));
        repository.save(new Course(2,"C#", "C# Programming"));
        repository.save(new Course(3,"JPA", "JPA Programming"));
        repository.save(new Course(4,"C++", "C++ Programming"));

        repository.deleteById(4l);

        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("Java Programming"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("JPA"));
    }
}
