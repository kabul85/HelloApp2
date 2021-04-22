package com.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public String getAllStudent() {
        return "These are all students";
    }

    @GetMapping("/id")
    public String getAllStudentById() {
        return "These are all students by id";
    }

    @GetMapping("/name")
    public String getAllStudentByName() {
        return "These are all students by name";
    }

    @GetMapping("/lastname")
    public String getAllStudentByLatName() {
        return "These are all students by last name";
    }
}
