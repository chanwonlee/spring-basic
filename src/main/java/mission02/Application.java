package mission02;

import mission02.config.AnnotationConfig;
import mission02.domain.Member;
import mission02.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        // memberService를 사용하는 시점에서 memberRepository의 구현체을 몰라도 심지어 구체적인 의존 관계를 몰라도 사용 가능
        MemberService memberService = context.getBean(MemberService.class);

        memberService.getMembers().forEach(System.out::println);
        memberService.addMember("memberD", 35);
        Member findMember = memberService.getMemberById(4L);
        System.out.println(findMember);
    }
}
