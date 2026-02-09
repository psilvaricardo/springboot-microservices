package com.example.spring.dummy_spring_framework_app1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    private int id;
    private String name;
    private String author;

}