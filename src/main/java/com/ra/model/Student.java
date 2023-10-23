package com.ra.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {
    private int studentId;
    private String studentName;
    private int age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
    private boolean status;

    public Student() {
    }

    public Student(int studentId, String studentName, int age, Date birthDate, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.birthDate = birthDate;
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
