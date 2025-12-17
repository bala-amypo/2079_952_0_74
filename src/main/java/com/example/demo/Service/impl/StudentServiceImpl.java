package com.example.demo.Service.impl;
import org.springframework.stereotype.Service;
import com.example.demo.Service.StudentService;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository stdrepo;
    @Override
    public Student poststudent(Student st){
            return stdrepo.save(st);
    }
    @Override
    public List<Student> getallstudents(){
            return stdrepo.findAll();
    }
}