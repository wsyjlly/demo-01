package cn.wsyjlly.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author wsyjlly
 * @create 2019.06.14 - 17:23
 **/
//@Component
@Aspect
public class RestfulCorsAspect {
    @Pointcut("execution(* cn.wsyjlly.controller.RestfulCorsController.*(..))")
    public void pc(){}

    @Before(value="pc()")
    public void before(JoinPoint jp){
        String name = jp.getSignature().getName();
        System.out.println(name+"方法开始执行...");
        System.out.println(name+"——————————————————————————————");
    }

    @After(value = "pc()")
    public void after(JoinPoint jp){
        String name = jp.getSignature().getName();
        System.out.println(name+"——————————————————————————————");
        System.out.println(name+"方法执行结束...");
    }

    @AfterReturning(value = "pc()" , returning = "result")
    public void afterReturning(JoinPoint jp,Object result){
        String name = jp.getSignature().getName();
        System.out.println(name+"方法返回值为："+result);
    }

    @AfterThrowing(value = "pc()" , throwing = "e")
    public void afterThrowing(JoinPoint jp,Exception e){
        String name = jp.getSignature().getName();
        System.out.println(name+"方法抛出异常："+e.getClass().getName());
    }

    @Around("pc()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        return pjp.proceed();
    }

}
