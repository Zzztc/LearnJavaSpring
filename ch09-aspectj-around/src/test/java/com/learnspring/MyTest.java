package com.learnspring;

import com.learnspring.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test03() {
        String config = "applicationContext2.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ctx.getBean("someService");
        String ret = service.doFirst("cc");
        System.out.println("返回值为：" + ret);
    }

}
