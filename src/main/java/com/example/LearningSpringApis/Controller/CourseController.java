package com.example.LearningSpringApis.Controller;

import com.example.LearningSpringApis.CourseDto.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return List.of(new Course(1, "Book", "Harry"));

    }
}
