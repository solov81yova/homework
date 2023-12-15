package homework38;

public class Customer extends Person {

  private double money;

  public Customer(String name, double money) {
    super(name);
    this.money = money;
  }
<<<<<<< HEAD
=======
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
>>>>>>> 032f19587351f600b0b42d426faff6c4e8e0b4e4

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public boolean pay(double amount) {
    if (money < amount) {
      System.out.println("Customer: I dont have enough money!");
      return false;
    }
    System.out.println("Customer: Sure, ill pay " + amount);
    money -= amount;
    return true;
  }

  public void buyProduct(Seller seller, String productName, int amount) {
    System.out.println("Customer: I want to buy "
        + amount + " " + productName + " please");
    double price = seller.getProductPrice(productName, amount);
    if (price == -1) {
      return;
    }
    boolean success = pay(price);
    if (!success) {
      return;
    }
    seller.sell(productName, amount);
    System.out.println("Customer: thanks!");
  }
}
=======
}

>>>>>>> 032f19587351f600b0b42d426faff6c4e8e0b4e4
