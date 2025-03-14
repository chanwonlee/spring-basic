package mission03.language;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 기본으로 주입될 빈 설정 만약 Primary가 2개라면 빈 충돌 오류 발생
public class Korean implements Language {
    @Override
    public void sayHello() {
        System.out.println("안녕하세요!");
    }
}
