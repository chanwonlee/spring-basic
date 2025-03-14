package mission03.language;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("english")
public class English implements Language {
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}
