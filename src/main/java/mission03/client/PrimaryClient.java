package mission03.client;

import mission03.language.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrimaryClient {

    private final Language service;

    @Autowired // Primary로 선언된 Korean 주입
    public PrimaryClient(Language service) {
        this.service = service;
    }

    public void sayHello() {
        service.sayHello();
    }
}
