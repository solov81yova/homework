package homework38;

public class Customer extends Person {

  private double money;

  public Customer(String name, double money) {
    super(name);
    this.money = money;
  }
/*
  public  void buyProduct(Seller seller, String productName, int amount) {
    double price = seller.getPrice(productName, amount);


    }

*/

public boolean payForProducts(double amount) {
    if (money >= amount) {
      money -= amount;
      System.out.println("You have successfully paid for products!");
      return true;
    } else {
      System.out.println("Unfortunately, you do not have enough money on your account");
      return false;
    }
}

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }
}

