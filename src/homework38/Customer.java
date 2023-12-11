package homework38;

public class Customer extends Person {

  private double money;


  public Customer(String name, double money) {
    super(name);
    this.money = money;
  }
  /*
  public void buyProduct(Seller seller, String productName, int amount) {

    double price = seller.getPrice(productName, amount);

  }

   */
  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }
}

/*

  }
}

     */