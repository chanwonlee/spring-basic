package mission06.badcase;

import mission06.badcase.service.ServiceA;
import mission06.badcase.service.ServiceB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public ServiceA serviceA() {
        return new ServiceA(serviceB());
    }

    @Bean
    public ServiceB serviceB() {
        return new ServiceB(serviceA());
    }
}
