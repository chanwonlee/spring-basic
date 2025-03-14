package mission02.config;

import mission02.repository.MemberRepository;
import mission02.repository.MemoryMemberRepository;
import mission02.service.MemberService;
import mission02.service.MemberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
    //JavaConfig를 사용한 빈 설정 -> @Configuration과 @Bean을 사용하여 의존 관계를 설정
    //구성 파일에서 정의된 빈 간 관계 구현하기 -> memberService는 memberRepository에 의존적인 관계임
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
        // return new MysqlMemberRepository(); -> mysql을 사용하고 싶다면 이렇게 변경하면 다른 코드를 수정할 필요 없이 의존 관계문제가 해결
    }

    // 인터페이스를 사용하여 의존성 주입하기 -> memberRepository라는 인터페이스를 주입하면
    // 스프링이 빈으로 등록된 MemoryMemberRepository를 주입
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
}