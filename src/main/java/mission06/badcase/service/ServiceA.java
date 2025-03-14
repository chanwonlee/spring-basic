package mission06.badcase.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceA {
    private final ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public void logic() {
        System.out.println("Service A 로직 실행");
    }
}
