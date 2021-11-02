package com.learnspring.controller;

import com.learnspring.domain.Student;
import com.learnspring.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String config="applicationContext.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentService studentService = (StudentService) ctx.getBean("studentService");
        Student student = new Student();
        student.setStuname(name);
        student.setStuage(Integer.valueOf(age));
        System.out.println(student);
        studentService.addStudent(student);
        request.getRequestDispatcher("/show.jsp").forward(request,response);
    }
}
