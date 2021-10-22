package com.learnspring;

import com.learnspring.service.Impl.SomeServiceImpl;
import com.learnspring.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args){
//        SomeService service=new SomeServiceImpl();
//        service.doSome();
        //1.指定spring配置文件：从类路径（classpath）之下开始的路径
        String config="beans.xml";
        //2.创建容器对象
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        //3.从容器中获取指定名称的对象，使用getB
        SomeService service = (SomeService)ctx.getBean("someService");
        //4.调用对象的方法，接口中的方法
        service.doSome();
    }
}
