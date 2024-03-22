package com.techlobster.techlobsteredu.modules.course.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlobster.techlobsteredu.modules.course.entities.CourseEntity;
import com.techlobster.techlobsteredu.modules.course.repositories.CourseRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("")
    @RequestMapping(produces = "application/json")
    public ResponseEntity<Object> list() {
        return ResponseEntity.ok().body("{message: List of courses [WIP]}");
    }

    @PostMapping("")
    public ResponseEntity<Object> create(@Valid @RequestBody CourseEntity course) {
        try {
            var courseCreated = this.courseRepository.save(course);
            return ResponseEntity.created(null).body(courseCreated);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
