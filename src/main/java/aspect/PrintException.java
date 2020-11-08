package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class PrintException {
    @AfterThrowing(value = "execution(* problem2.service.ThrowException.throw*(..))", throwing = "exception")
    public void printException(JoinPoint joinPoint, Exception exception){
        System.out.println(joinPoint.getSignature().getName()+"에서 에러가 발생했습니다.");
        System.out.println("exception : " + exception);
    }
}
