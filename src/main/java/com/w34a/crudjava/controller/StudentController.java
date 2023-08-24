package com.w34a.crudjava.controller;

import com.w34a.crudjava.entity.DataStudents;
import com.w34a.crudjava.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<DataStudents> getAll(){
        return studentService.getStudents();
    }
    @GetMapping("/{studentId}")
    public Optional<DataStudents> getById(@PathVariable("studentId") Long studentId){
        return studentService.getStudentById(studentId);
    }
    @PostMapping
    public void saveUpdate(@RequestBody DataStudents dataStudents){
        studentService.saveOrUpdate(dataStudents);
    }
    @DeleteMapping("/{studentId}")
    public void delete(@PathVariable("studentId") Long studentId){
        studentService.delete(studentId);
    }
}
