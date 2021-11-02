package com.learnspring.service.Impl;

import com.learnspring.dao.StudentDao;
import com.learnspring.domain.Student;
import com.learnspring.service.StudentService;
import lombok.Setter;

@Setter
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;
    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public Student findStudentById(Integer id) {

        Student selectById = studentDao.selectById(id);
        return selectById;
    }
}
