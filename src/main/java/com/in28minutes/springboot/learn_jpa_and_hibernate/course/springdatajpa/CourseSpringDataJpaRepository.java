package com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

//    we can add our custom methods in this interface

    List<Course>findByAuthor(String author);
    List<Course>findByName(String name);
}
