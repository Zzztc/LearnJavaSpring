package com.learnspring.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myStudent")
public class Student {
    /**
     * 简单类型属性赋值：@Value
     * @Value：简单类型属性赋值
     *    属性：value 简单类型属性值
     *    位置：1）在属性定义的上面，无需set方法，推荐使用
     *         2）在set方法的上面
     *
     */


//  使用外部属性文件中的数据，语法：@Value("${key}")
    @Value("${myname}")
    private String name;
    @Value("${myage}")
    private int age;

    /**
     *
     * 引用类型
     * @Autowired: spring框架提供的，给引用类型赋值的，使用自动注入原理
     *             支持byName，byType，默认是byType
     *        位置：1）在属性定义的上面，无需set方法，推荐
     *             2）在set方法的上面
     *
     * byName自动注入：
     * 1）@Autowired：给引用类型赋值
     * 2）@Qualifier(value="bean的id"):从容器中找到指定名称的对象，
     *                                把这个对象赋值给引用类型
     */
    //byName
    @Autowired
    @Qualifier("mySchool")
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
