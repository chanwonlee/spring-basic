package mission07;

import mission07.config.ContextConfiguration;
import mission07.domain.Account;
import mission07.repository.AccountRepository;
import mission07.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        AccountRepository repository = context.getBean(AccountRepository.class);
        AccountService service = context.getBean(AccountService.class);
        int id1 = repository.addAccount(2000);
        int id2 = repository.addAccount(2000);

        System.out.println("=== 정상 이체 ===");
        // 정상 이체 -> account1 = 1000, account2 = 3000
        Account account1 = repository.findById(id1);
        Account account2 = repository.findById(id2);
        service.transfer(account1, account2, 1000);
        System.out.println("account1.getBalance() = " + account1.getBalance());
        System.out.println("account2.getBalance() = " + account2.getBalance());

        System.out.println("\n=== 이체 중 예외 발생 ===");
        // 예외 발생 -> account1의 잔액 부족 -> account1 = 1000, account = 3000으로 롤백
        service.transfer(account1, account2, 1500);
        System.out.println("account1.getBalance() = " + account1.getBalance());
        System.out.println("account2.getBalance() = " + account2.getBalance());
    }
}
