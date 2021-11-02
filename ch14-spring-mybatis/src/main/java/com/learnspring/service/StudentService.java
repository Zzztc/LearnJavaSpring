package com.learnspring.service;

import com.learnspring.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudent();

}
