package com.ra.serviceImp;

import com.ra.model.Student;
import com.ra.repository.StudentRepository;
import com.ra.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    //DI - Dependency Injection
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public boolean createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentRepository.update(student);
    }

    @Override
    public boolean deleteStudent(int studentId) {
        return studentRepository.delete(studentId);
    }
}
