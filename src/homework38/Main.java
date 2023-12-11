package homework38;

public class Main {

  public static void main(String[] args) {
    Person person = new Person("Victoriia");
    person.introduce(person);
    Seller seller = new Seller();
    seller.greeting();
    String[] products = {"Cheese", "Rice", "Tee", "Coffee", "Butter", "Milk", "Potato", "Apples",
        "Sausage", "Meat"};
  }

}
