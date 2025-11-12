package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
                new Course(1, "Course 1", "Description 1"),
                new Course(2, "Course 2", "Description 2"),
                new Course(3, "Course 3", "Description 3")
        );
    }

}
