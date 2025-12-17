package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Service.StudentService;
import java.util.List;
@RestController
public class StudentController{
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stdser.poststudent(st);
    }
    @GetMapping("/getallStudents")
    public List<Student> get(){
        return stdser.getallstudents();
    }
}