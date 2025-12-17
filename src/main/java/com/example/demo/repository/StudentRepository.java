package com.example.demo.repository;
import com.example.demo.entity.Student; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ste
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}                                          