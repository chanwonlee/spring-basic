package mission07.service;

import mission07.aop.MyTransactional;
import mission07.domain.Account;
import mission07.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @MyTransactional // AOP 적용
    public void transfer(Account from, Account to, int money) {
        System.out.println("계좌 이체 로직 실행 [계좌" + from.getId() + " -> 계좌" + to.getId() + ", " + money + "송금]");
        accountRepository.update(from, -money);
        accountRepository.update(to, money);
    }
}
