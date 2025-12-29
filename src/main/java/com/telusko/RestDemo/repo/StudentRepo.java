package com.telusko.RestDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.telusko.RestDemo.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
