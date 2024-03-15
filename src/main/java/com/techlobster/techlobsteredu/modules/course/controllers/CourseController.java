package com.techlobster.techlobsteredu.modules.course.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @GetMapping("")
    @RequestMapping(produces = "application/json")
    public ResponseEntity<Object> list() {
        return ResponseEntity.ok().body("{message: List of courses [WIP]}");
    }
    
}
