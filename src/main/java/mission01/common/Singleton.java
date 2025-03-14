package mission01.common;

import org.springframework.stereotype.Component;

@Component
public class Singleton {
    private int number = 0;

    public void increaseNumber() {
        number++;
    }

    public int getNumber() {
        return number;
    }
}
