package homework27.task02;

public class BankAccount {

  private int amountOfMoney;// сумма денег на счете (баланс)
  private final String accountNumber;// текущий номер счета

  // конструктор банковского счета
  public BankAccount(String accountNumber) {
    this.amountOfMoney = 0;
    this.accountNumber = accountNumber;
  }

  public int getAmountOfMoney() {
    return amountOfMoney;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

// метод снятия денег со счета
  public int withdrawMoney(int amount) {
    if (amount < 0) {
      System.out.println("Error! Check your balance.");
    }
    return 0;
  }
  // метод пополнения баланса счета
  public void putMoney(int amount) {
    if (amount > amountOfMoney) {
      amountOfMoney += amount;
      System.out.println("Your balance now is: " + amount);
    }
  }
}
