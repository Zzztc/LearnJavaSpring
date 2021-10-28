package com.learnspring;

import com.learnspring.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest3 {

    @Test
    public void test01(){
        String config="applicationContext3.xml";
        ApplicationContext ctx= new ClassPathXmlApplicationContext(config);
        Student student=(Student)ctx.getBean("myStudent");
        System.out.println(student);
    }
}
