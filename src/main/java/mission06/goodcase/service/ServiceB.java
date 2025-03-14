package mission06.goodcase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceB {
    private ServiceA serviceA;

    // 생성자가 아닌 Setter 주입을 사용하면 Spring이 빈을 먼저 생성한 후, setter를 통해 주입하므로 순환 의존성을 해결할 수 있음.
    @Autowired
    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void logic() {
        System.out.println("Service B 로직 실행");
    }
}
