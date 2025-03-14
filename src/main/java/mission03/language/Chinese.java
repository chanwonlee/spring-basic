package mission03.language;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chinese")
public class Chinese implements Language {
    @Override
    public void sayHello() {
        System.out.println("你好!");
    }
}
