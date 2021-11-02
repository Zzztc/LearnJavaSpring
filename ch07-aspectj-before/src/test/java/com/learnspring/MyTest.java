package com.learnspring;

import com.learnspring.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        SomeService service=(SomeService) ctx.getBean("someService");
        service.doSome("lisi",20);
        System.out.println("service=="+service.getClass().getName());
    }

    @Test
    public void test02(){
        String config="applicationContext2.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        //加入代理的处理：
        //1）目标方法执行时，有切面功能的
        //2）service对象是改变后的 代理对象 com.sun.proxy.$Proxy8
        SomeService service=(SomeService) ctx.getBean("someService");
        service.doSome("lisi",20);
        //com.sun.proxy.$Proxy8：代理对象
        System.out.println("service=="+service.getClass().getName());
    }
@Test
    public void test03(){
        String config="applicationContext2.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        //加入代理的处理：
        //1）目标方法执行时，有切面功能的
        //2）service对象是改变后的 代理对象 com.sun.proxy.$Proxy8
        SomeService service=(SomeService) ctx.getBean("someService");
        service.doSome("lisi",20);
        //com.sun.proxy.$Proxy8：代理对象
        service.doOther();
        System.out.println("service=="+service.getClass().getName());
    }

}
