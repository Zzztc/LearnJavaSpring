package com.learnspring.ba05;

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
     *        属性：required：boolean类型的属性，默认true
     *             true：spring在启动时，创建容器对象的时候，会检查引用类型是否复制成功，
     *                   若赋值失败，终止程序执行，并报错
     *             false：引用类型复制失败，程序正常执行，不报错，引用类型的值是null
     *
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
