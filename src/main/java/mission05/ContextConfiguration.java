package mission05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public TestBean testBean() {
        System.out.println("== 의존 관계 주입 시작 ==");
        return new TestBean();
    }
}
