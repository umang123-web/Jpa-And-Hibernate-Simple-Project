package com.springboot.learn_jpa_and_hibernate.course.jpa;

import com.springboot.learn_jpa_and_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {
@PersistenceContext
private EntityManager entityManager;

public void insert(Course course){
    entityManager.merge(course);
}

public Course findById(long id){
    return entityManager.find(Course.class , id);
}

public void deleteById(long id){
   Course course = new Course();
   entityManager.find(Course.class , id);
   entityManager.remove(course);
}


}
