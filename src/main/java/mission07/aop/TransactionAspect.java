package mission07.aop;

import mission07.exception.NotEnoughMoneyException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component()
public class TransactionAspect {
    @Pointcut("@annotation(mission07.aop.MyTransactional)")
    public void transactionPointcut() {
    }

    @Around("transactionPointcut()")
    public Object transactionAround(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            System.out.println("MyTransactional AOP 실행");
            return joinPoint.proceed();
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
            System.out.println("예외 발생 -> 롤백 진행");
            System.out.println("롤백 진행중");
            return null;
        } finally {
            System.out.println("MyTransactional AOP 종료");
        }
    }
}
