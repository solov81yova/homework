package homework38;

public class Main {

  public static void main(String[] args) {
    Person person = new Person("Victoriia");
    person.introduce(person);
    Seller seller = new Seller();
    seller.greeting();
    Product[] products = new Product[10];
    String[] names = {"Cheese", "Rice", "Tee", "Coffee", "Butter", "Milk", "Potato", "Apples",
        "Sausage", "Meat"};
    Customer customer = new Customer("Diana", 400);
    customer.payForProducts(340);
    seller.sayPrice("Cheese", 50);
  }

}
