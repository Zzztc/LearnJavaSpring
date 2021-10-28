package com.learnspring.ba06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
     * 引用类型
     * @Resource： 来自jdk中，给引用类型赋值的，支持byName，byType，默认是byName
     *             spring支持这个注解的使用
     *       属性：指定byName赋值：
     *             name：bean的id @Resource("mySchool")
     *       位置： 1）在属性定义的上面，无需set方法，推荐
     *             2）在set方法的上面
     *   说明：使用jdk1.8带有Resource注解，高于1.8没有
     *        从maven仓库里搜annotation找javax包中的注解插件
     */
    //默认使用buName自动注入
    //先使用byName赋值，如果赋值失败，再使用byType
    //这里使用byType
    @Resource
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
