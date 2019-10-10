package com.tutorial.fullstack.crud.reactspringbootfullstacktutorial.Service;

import com.tutorial.fullstack.crud.reactspringbootfullstacktutorial.Model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HardcodedCourseService {
    private static List<Course> courses = new ArrayList<>();
    private static long idCounter = 0;


    static {
        courses.add(Course.builder().id(++idCounter).username("in28minutes").description("Learn Full stack with Spring Boot and Angular").build());
        courses.add(Course.builder().id(++idCounter).username("in28minutes").description("Master Microservices with Spring Boot and Spring Cloud").build());
        courses.add(Course.builder().id(++idCounter).username("in28minutes").description("Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes").build());
    }

    public List<Course> findAll() {
        return courses;
    }

    public Course deleteById(long id){
        Course course = findById(id);

        if(course == null){
            return null;
        }

        if(courses.remove(course)){
            return course;
        }

        return null;
    }

    public Course findById(long id){
        for(Course course : courses){
            if(course.getId() == id){
                return course;
            }
        }
        return null;
    }


}
