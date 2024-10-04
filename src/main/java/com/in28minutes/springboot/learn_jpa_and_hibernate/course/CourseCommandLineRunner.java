package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa.CourseJPARepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//This is used when we run some logic run at the start of spring application then this is use
@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    /*@Autowired
    private CourseJdbcRepository repository;*/

   /* @Autowired
    private CourseJPARepository repository;*/

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Course(1 , "LearnAws" , "in28minutes"));
        repository.save(new Course(2 , "Learn Azure" , "in28minutes"));
        repository.save(new Course(3 , "Learn Devops" , "in28minutes"));

        repository.deleteById(1l);

        /*
        * why the result is null because we have only getter in course class not
        * setter so we should also add the setter method in Course class
        * */

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByName("Learn Azure"));


    }
}
