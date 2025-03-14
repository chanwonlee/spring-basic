package mission04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("mission04/properties/member-info.properties") //properties정보를 불러옴
public class ContextConfiguration {
    @Value("${member.name}") // properties의 Key값에 해당하는 value를 불러와서 변수에 주입
    private String name;

    @Value("${member.age}")
    private int age;

    @Bean
    public Member member() {
        return new Member(name, age);
    }
}
