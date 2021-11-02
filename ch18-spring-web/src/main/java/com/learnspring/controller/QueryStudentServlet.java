package com.learnspring.controller;

import com.learnspring.domain.Student;
import com.learnspring.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class QueryStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stuId=request.getParameter("stuid");
        String config="applicationContext.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentService studentService = (StudentService) ctx.getBean("studentService");
        Student studentById = studentService.findStudentById(Integer.valueOf(stuId));
        System.out.println(studentById);
        request.setAttribute("stu",studentById);
        request.getRequestDispatcher("/show.jsp").forward(request,response);
    }
}
