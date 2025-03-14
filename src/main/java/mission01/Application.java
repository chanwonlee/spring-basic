package mission01;

import mission01.common.Prototype;
import mission01.common.Singleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("mission01.common");

        //singleton test
        Singleton singletonBean1 = context.getBean(Singleton.class);
        singletonBean1.increaseNumber();
        System.out.println("singletonBean1.number: " + singletonBean1.getNumber());

        Singleton singletonBean2 = context.getBean(Singleton.class);
        singletonBean2.increaseNumber();
        System.out.println("singletonBean2.number: " + singletonBean2.getNumber());

        // Singletone 객체는 하나만 생성되기 때문에 주소값이 같다.
        System.out.println("singletonBean1 주소값: " + singletonBean1.hashCode() + ", " +
                           "singletonBean2 주소값: " + singletonBean2.hashCode());

        //prototype test
        Prototype prototypeBean1 = context.getBean(Prototype.class);
        prototypeBean1.increaseNumber();
        System.out.println("prototypeBean1.number: " + prototypeBean1.getNumber());

        Prototype prototypeBean2 = context.getBean(Prototype.class);
        prototypeBean2.increaseNumber();
        System.out.println("prototypeBean2.number: " + prototypeBean2.getNumber());

        // Prototype 객체는 매번 새로 생성되기 때문에 주소값이 다르다.
        System.out.println("prototypeBean1 주소값: " + prototypeBean1.hashCode() + ", " +
                           "prototypeBean2 주소값: " + prototypeBean2.hashCode());
    }
}
