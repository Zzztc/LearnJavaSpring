package com.learnspring;

import com.learnspring.ba03.Student;
import com.learnspring.ba03.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {
    @Test
    public void test01(){
        String config="ba03/applicationContext.xml";
        ApplicationContext ctx= new ClassPathXmlApplicationContext(config);
        Student student = (Student)ctx.getBean("myStudent");
        System.out.println("student="+student);
    }
    @Test
    public void test02(){
        String config="ba03/applicationContext.xml";
        ApplicationContext ctx= new ClassPathXmlApplicationContext(config);
        Student student = (Student)ctx.getBean("myStudent2");
        System.out.println("student="+student);
    }
    @Test
    public void test03(){
        String config="ba03/applicationContext.xml";
        ApplicationContext ctx= new ClassPathXmlApplicationContext(config);
        Student student = (Student)ctx.getBean("myStudent3");
        System.out.println("student="+student);
    }
@Test
    public void test04(){
        String config="ba03/applicationContext.xml";
        ApplicationContext ctx= new ClassPathXmlApplicationContext(config);
        File file = (File)ctx.getBean("myFile");
        System.out.println("file="+file.getName());
    }

}
