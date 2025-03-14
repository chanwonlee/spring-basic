package mission05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        TestBean testBean = context.getBean(TestBean.class);
        testBean.logic();
        context.close();
    }
}
