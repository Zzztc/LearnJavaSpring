package com.learnspring;

import static org.junit.Assert.assertTrue;

import com.learnspring.dao.StudentDao;
import com.learnspring.domain.Student;
import com.learnspring.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        StudentService studentService = (StudentService) ctx.getBean("studentService");
        Student student=new Student();
        student.setName("李四");
        student.setAge(20);
        studentService.addStudent(student);
    }
    @Test
    public void test02(){
        String config="applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        StudentService studentService = (StudentService) ctx.getBean("studentService");
        List<Student> students = studentService.queryStudent();
        for (Student stu :
                students) {
            System.out.println(stu);
        }
    }

}
