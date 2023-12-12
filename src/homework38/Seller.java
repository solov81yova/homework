package homework38;

public class Seller extends Product {

  private Product[] products;

  public Seller() {
    products = new Product[10];
  }

  public void greeting() {
    System.out.println("Good day! What would you like to buy?");
  }

  public double sayPrice(String name, int quantity) {
    for (int i = 0; i < products.length; i++) {
      if (this.products == products && this.getQuantity() >= quantity) {
        return getPrice();
      }
      }
        return -1;
      }

    }


