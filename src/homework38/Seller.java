package homework38;

public class Seller {
private Product[] products;

  public Seller() {
    products = new Product[10];
    String[] products = {"Cheese", "Rice", "Tee", "Coffee", "Butter", "Milk", "Potato", "Apples",
        "Sausage", "Meat"};
    }

  public void greeting() {
    System.out.println("Good day! What would you like to buy?");
    System.out.println("We have the next products: " + products.length);
    for (int i = 0; i < products.length; i++) {
      System.out.print(products[i] + ", ");

    }
  }
  public void sayPrice(String name, int quantity ) {
    for (int i = 0; i < products.length; i++) {
      if (products[i] == products[i]) {

      }

    }

  }
}
