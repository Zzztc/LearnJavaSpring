package com.learnspring.handle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
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
        环绕通知方法的定义
        1）方法是public
        2）方法必须要返回值，推荐使用Object类型
        3）方法名称自定义
        4）方法必须有参数，ProceedingJoinPoint
     */

    /**
     *
     * @Around：环绕通知
     *    属性：value 切入点表达式
     *    位置：在方法定义的上面
     *
     *   返回值：Object，表示调用目标方法希望得到执行结果（不一定是目标方法自己的返回值）
     *    参数：ProceedingJoinPoint，机当于反射中Method。
     *         作用：执行目标方法的，等method.invoke()
     * 特点：
     * 1.在目标方法的前和后都能增强功能
     * 2.控制目标方法是否执行
     * 3.修改目标方法的执行结果。
     *
     */
    @Around(value = "execution(* *.eeee.SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("执行了myAround方法之前，输出日志时间=="+ new Date());

        //执行目标方法 ProceedingJoinPoint ，表示doFirst
        Object methodReturn=null;
        methodReturn = pjp.proceed();//method.invoke(),表示执行doFirst()方法本身

//        return "Hello Around";
        return methodReturn;
    }
}
