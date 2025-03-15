package mission07.repository;

import java.util.ArrayList;
import java.util.List;
import mission07.domain.Account;
import mission07.exception.NotEnoughMoneyException;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
    private static int SEQUENCE = 0;
    private final List<Account> accounts = new ArrayList<>();

    public int addAccount(int balance) {
        accounts.add(new Account(++SEQUENCE, balance));
        return SEQUENCE;
    }

    public Account findById(int id) {
        return accounts.stream()
                .filter(account -> account.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // 잔액이 부족하면 예외 발생
    public void update(Account account, int amount) {
        int newBalance = account.getBalance() + amount;
        if (newBalance < 0) {
            throw new NotEnoughMoneyException("계좌" + account.getId() + "의 잔액이 " + Math.abs(newBalance) + " 부족합니다.");
        }
        account.updateBalance(newBalance);
    }
}
