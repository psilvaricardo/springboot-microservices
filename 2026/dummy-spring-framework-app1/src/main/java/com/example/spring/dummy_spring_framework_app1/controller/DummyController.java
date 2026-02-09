package com.example.spring.dummy_spring_framework_app1.controller;

import com.example.spring.dummy_spring_framework_app1.model.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DummyController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"AWS", "dummyAutor1"),
                new Course(2,"DevOps", "dummyAutor2"),
                new Course(3,"Linux", "dummyAutor3"),
                new Course(4,"Unix", "dummyAutor4"),
                new Course(5,"Docker", "dummyAutor5")
        );
    }

    @GetMapping("/debug-info")
    public String debugInfo(@Value("${info.app.name}") String appName) {
        return "App name = " + appName;
    }

}
