package ua.epam.spring.core.aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspectXML {

    public void logBefore(JoinPoint joinPoint){
        System.out.println("Aspect from xml-config start in " + joinPoint.getTarget().getClass());
    }

    public void logAfter(JoinPoint joinPoint){
        System.out.println("Aspect from xml-config finish in " + joinPoint.getTarget().getClass());
    }
}
