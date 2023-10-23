package com.ra.repository;

import com.ra.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    Student findById(int studentId);
    boolean save(Student student);
    boolean update(Student student);
    boolean delete(int studentId);
}
