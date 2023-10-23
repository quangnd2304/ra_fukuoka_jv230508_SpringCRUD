package com.ra.service;

import com.ra.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student getStudentById(int studentId);
    boolean createStudent(Student student);
    boolean updateStudent(Student student);
    boolean deleteStudent(int studentId);
}
