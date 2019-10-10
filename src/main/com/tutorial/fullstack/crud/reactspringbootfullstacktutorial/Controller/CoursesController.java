package com.tutorial.fullstack.crud.reactspringbootfullstacktutorial.Controller;

import com.tutorial.fullstack.crud.reactspringbootfullstacktutorial.Model.Course;
import com.tutorial.fullstack.crud.reactspringbootfullstacktutorial.Service.HardcodedCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class CoursesController {

    @Autowired
    private HardcodedCourseService hardcodedCourseService;

    @GetMapping("/instructors/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username){
        return hardcodedCourseService.findAll();
    }

    @DeleteMapping("/instructors/{username}/courses/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable String username, @PathVariable long id){
        Course course = hardcodedCourseService.deleteById(id);

        if(course != null){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
