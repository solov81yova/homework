package homework38;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
<<<<<<< HEAD
    Seller seller = new Seller("John");
    Customer customer = new Customer("Daniel", 100);
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    int amount = scanner.nextInt();
    customer.buyProduct(seller, name, amount);
=======
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
>>>>>>> 032f19587351f600b0b42d426faff6c4e8e0b4e4
  }
}
