package com.demo.demo.controller;

import com.demo.demo.entity.students;
import com.demo.demo.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {

    @Autowired
    private studentService studentService;

    @PostMapping("/savestudents")
    public students saveData(@RequestBody students students){
        return studentService.saveStudent(students);
    }

    @GetMapping("/students")
    public List<students> getStudetns(){
        return studentService.getStudents();
    }
    
    @GetMapping("/text")
    public String getStudetns(){
        return "text data";
    }
    
    @PostMapping("/students/{id}")
    public students getStudentById(@PathVariable("id") long id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable("id") long id){
        studentService.deleteStudentById(id);
        return "{'success':'OK'}";
    }

    @PutMapping("/students/{id}")
    public students updateStudentById(@PathVariable("id") long id,@RequestBody students students){
        return studentService.updateStudentById(id,students);
    }
}
