package com.learnspring.service.Impl;

import com.learnspring.dao.StudentDao;
import com.learnspring.domain.Student;
import com.learnspring.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int rows=studentDao.insertStudent(student);
        return rows;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> studentList = studentDao.selectStudents();
        return studentList;
    }
}
