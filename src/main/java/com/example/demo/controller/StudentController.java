package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Service.StudentService;
import java.util.*;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
@RestController
public class StudentController{
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public Student addStudent(@Valid @RequestBody Student st){
        return stdser.poststudent(st);
    }
    @GetMapping("/getallStudents")
    public List<Student> get(){
        return stdser.getallstudents();
    }
    @GetMapping("/getByStudent/{id}")
    public Optional<Student> getStudent(@PathVariable Long id){
        return stdser.getById(id);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id,@RequestBody Student st){
        return stdser.updateData(id,st);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return stdser.deleteData(id);
    }
}