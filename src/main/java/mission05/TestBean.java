package mission05;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TestBean {

    public TestBean() {
        System.out.println("빈 생성");
    }

    public void logic() {
        System.out.println("로직 실행");
    }

    @PostConstruct
    public void init() {
        System.out.println("== 빈 생성후 의존관계 주입이 완료된후 호출 ==");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("== 빈이 소멸되기 직전에 호출 ==");
    }
}
