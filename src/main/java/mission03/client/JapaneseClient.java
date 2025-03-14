package mission03.client;

import mission03.language.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JapaneseClient {
    private final Language service;

    @Autowired // @Qualifier로 명시한 Japanese 주입
    public JapaneseClient(@Qualifier("japanese") Language service) {
        this.service = service;
    }

    public void sayHello() {
        service.sayHello();
    }
}
