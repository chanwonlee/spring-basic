package mission06.goodcase;

import mission06.goodcase.service.ServiceA;
import mission06.goodcase.service.ServiceB;
import org.springframework.context.annotation.Bean;

public class ContextConfiguration {

    @Bean
    public ServiceA serviceA() {
        return new ServiceA(serviceB());
    }

    @Bean
    public ServiceB serviceB() {
        return new ServiceB();
    }
}
