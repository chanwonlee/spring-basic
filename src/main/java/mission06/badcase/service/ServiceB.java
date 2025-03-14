package mission06.badcase.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceB {
    private final ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void logic() {
        System.out.println("Service B 로직 실행");
    }
}
