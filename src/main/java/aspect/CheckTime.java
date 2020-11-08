package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CheckTime {
    @Around("execution(* problem1.service.FindElement.*Search(..))")
    public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before");
        Object proceed = joinPoint.proceed();
        System.out.println("After");
        return proceed;
    }
}
