package com.telusko.RestDemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telusko.RestDemo.model.Student;
import com.telusko.RestDemo.repo.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
