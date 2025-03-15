package mission07.domain;

import mission07.exception.NotEnoughMoneyException;

public class Account {
    private final int id;
    private int balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public void updateBalance(int balance) {
        if (balance < 0) {
            throw new NotEnoughMoneyException("남은 금액은 0원 미만일 수 없습니다.");
        }
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }
}
