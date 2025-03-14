package mission01.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prototype {
    private int number = 0;

    public void increaseNumber() {
        number++;
    }

    public int getNumber() {
        return number;
    }
}
