package com.learnspring.dao;

import com.learnspring.domain.Student;

public interface StudentDao {
    int insertStudent(Student student);
    Student selectById(Integer id);
}
