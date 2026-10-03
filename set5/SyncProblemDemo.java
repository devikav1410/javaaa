class BankAccount {
    private int balance = 100;

    public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw. Insufficient balance!");
        }
    }
}

class WithdrawTask extends Thread {
    private BankAccount account;

    public WithdrawTask(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(60);
    }
}

public class SyncProblemDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        WithdrawTask t1 = new WithdrawTask(account);
        WithdrawTask t2 = new WithdrawTask(account);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
