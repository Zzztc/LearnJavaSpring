package com.learnspring.handle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Date;

/**
 * @Aspect：切面类的注解
 *    位置：放在某个类的上面
 *    作用：表示当前类是切面类
 *    切面类：表示切面功能的类
 */
@Aspect
public class MyAspect {

    @Before(value = "mypt()")
    public void myBefore(){
        System.out.println("前置通知，在目标方法之前先执行的");
    }

    @After(value = "mypt()")
    public void myAfter(){
        System.out.println("执行了最终通知");
    }

    /**
     * @Pointcut：定义和管理切入点，不是通知注解
     *      位置：value 切入点表达式
     *      位置：在一个自定义方法的上面，这个方法看作是切入点表达式的别名
     *           其他的通知注解中，可以使用方法方法名称，就表示使用这个切入点表达式了
     */
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void mypt(){}
}
