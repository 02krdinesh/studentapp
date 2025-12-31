package com.telusko.RestDemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.telusko.RestDemo.model.Student;
import com.telusko.RestDemo.service.StudentService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    @DeleteMapping("/{id}")
    public List<Student> deleteStudents(@PathVariable int id) {
        service.deleteStudentById(id);
        System.out.println(id);
        List<Student> list = service.getAllStudents();
        Student st1 = new Student();
        st1.setName("updated");
        st1.setAge(2026);
        list.add(st1);
        return list;
    }
}
