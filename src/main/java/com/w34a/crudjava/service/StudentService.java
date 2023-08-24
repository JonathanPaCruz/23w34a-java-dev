package com.w34a.crudjava.service;


import com.w34a.crudjava.entity.DataStudents;
import com.w34a.crudjava.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<DataStudents> getStudents(){
        return studentRepository.findAll();
    }
    public Optional<DataStudents> getStudentById(Long id){
        return studentRepository.findById(id);
    }
    public void saveOrUpdate(DataStudents dataStudents){
        studentRepository.save(dataStudents);
    }
    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
