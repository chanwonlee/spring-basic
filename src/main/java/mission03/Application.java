package mission03;

import mission03.client.ChineseClient;
import mission03.client.EnglishClient;
import mission03.client.JapaneseClient;
import mission03.client.PrimaryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        //@ComponentScan방식 사용
        ApplicationContext context = new AnnotationConfigApplicationContext("mission03");

        // @Primary로 지정한 한국어가 출력
        PrimaryClient primaryClient = context.getBean(PrimaryClient.class);
        primaryClient.sayHello();

        // @Qualifier로 지정한 영어가 출력
        EnglishClient englishClient = context.getBean(EnglishClient.class);
        englishClient.sayHello();

        // @Qualifier로 지정한 일본어가 출력
        JapaneseClient japaneseClient = context.getBean(JapaneseClient.class);
        japaneseClient.sayHello();

        // @Qualifter로 지정한 중국어가 출력
        ChineseClient chineseClient = context.getBean(ChineseClient.class);
        chineseClient.sayHello();
    }
}
