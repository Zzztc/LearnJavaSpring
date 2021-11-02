package com.learnspring.service;

import com.learnspring.domain.Student;

public interface StudentService {
    int addStudent(Student student);
    Student findStudentById(Integer id);
}
