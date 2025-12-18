package com.example.demo.Service;
import com.example.demo.entity.Student;
import java.util.*;
public interface StudentService{
    Student poststudent(Student st);
    List<Student> getallstudents();
    Optional<Student> getById(Long id);
    String updateData(Long id,Student st);
}
