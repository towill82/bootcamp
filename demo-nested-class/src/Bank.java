import java.util.LinkedList;
import java.util.List;

public class Bank {
  public List<Account> accounts;

  public Bank() {
    this.accounts = new LinkedList<>();
  }

  public void add(Account account) {
    accounts.add(account);
  }
  public static class Account {
    private static int number = 0;
    private int acctNo;


    public Account() {
      this.acctNo = ++number;
    }
  }
  public static void main(String[] args) {
    Bank bank = new Bank();
    Bank.Account account = new Bank.Account();
  }
}
