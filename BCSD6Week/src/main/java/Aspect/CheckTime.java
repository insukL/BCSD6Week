package Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class CheckTime {
    @Around("execution(* Problem1.service.FindElement.*Search(..))")
    public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before");
        Object proceed = joinPoint.proceed();
        System.out.println("After");
        return proceed;
    }
}
