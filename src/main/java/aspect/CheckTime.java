package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
@EnableAspectJAutoProxy
public class CheckTime {
    StopWatch stopWatch = new StopWatch();
    @Around("execution(* problem1.service.FindElement.*Search(..))")
    public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable {
        stopWatch.start(joinPoint.getSignature().getName());
        Object proceed = joinPoint.proceed();
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
        return proceed;
    }
}
