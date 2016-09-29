package ua.epam.spring.core.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspectAnnotation {

    @Pointcut("execution(public void logEvent(..))")
    public void allLogEventMethods(){
    }

    @Before("allLogEventMethods()")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Aspect from annotation-config start in " + joinPoint.getTarget().getClass());
    }

    @After("allLogEventMethods()")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("Aspect from annotation-config finish in " + joinPoint.getTarget().getClass());
    }
}
