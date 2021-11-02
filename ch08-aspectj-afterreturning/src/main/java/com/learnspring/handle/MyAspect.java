package com.learnspring.handle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @Aspect：切面类的注解
 *    位置：放在某个类的上面
 *    作用：表示当前类是切面类
 *    切面类：表示切面功能的类
 */
@Aspect
public class MyAspect {
    //定义方法，表示切面的具体功能
    /*
        后置通知方法的定义
        1）方法是public
        2）方法是void
        3）方法名称自定义
        4）方法可以有参数，推荐使用Object类型
     */
    /**
        @AfterReturning：后置通知
           属性：value 切入点表达式
                returning 自定义的变量，表示目标方法的返回
                          自定义变量名称必须和通知方法的形参名一样
           位置：在方法的上面
        特点：
        1）执行时间：在目标防方法之后执行
        2）能够获取到目标方法的执行结果
        3）不会影响目标方法的执行

     方法的参数：
        Object res：表示目标方法的返回值，使用res接受doOther的调用结果
        Object res= doOther();
     后置通知的执行顺序：
        Object res = SomeServiceImpl.doOther(..);
        myAfterReturning(res;

     */
@AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",
returning = "res")

/**
 *使用JoinPoint时，必须放在第一个参数的位置
 */
    public void myAfterReturning(Object res){
    System.out.println("后置通知，在目标方法之后执行，能拿到执行结果"+res);
    }

}
