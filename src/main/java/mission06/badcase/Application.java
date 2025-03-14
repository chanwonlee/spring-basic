package mission06.badcase;

import mission06.goodcase.service.ServiceA;
import mission06.goodcase.service.ServiceB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        //UnsatisfiedDependencyException 에러 발생
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        ServiceA serviceA = context.getBean(ServiceA.class);
        serviceA.logic();
        ServiceB serviceB = context.getBean(ServiceB.class);
        serviceB.logic();
    }
}
