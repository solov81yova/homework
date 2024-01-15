package homework47.task01;
/*
Вспомним урок 11 задачу номер 5, в которой мы сделали симуляцию кассы. (код приведен ниже)
Тогда нам пришлось создать два отдельных массива для наименований и цен, теперь давайте объединим
их в один.
Для этого создайте обобщенный класс Pair с двумя обобщенными типами (записать через запятую).
Естественно, что нужно будет создать два поля этих типов и определить для них аксесcоры, чтобы
пользоваться классом.
После этого, переписать код таким образом, чтобы был один массив типа Pair<String, Double>
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Pair<String, Double>[] productsAndPrices = new Pair[]{
        new Pair<>("Apple", 2.0),
        new Pair<>("Potato", 1.5),
        new Pair<>("Cucumber", 2.5),
        new Pair<>("Tomato", 3.0),
        new Pair<>("Onion", 1.0),
        new Pair<>("Grape", 3.5)
    };
    Scanner scanner = new Scanner(System.in);
    String userChoice = scanner.nextLine();
    int index = -1;
    for (int i = 0; i < productsAndPrices.length; i++) {
      if (userChoice.equals(productsAndPrices[i].getFirst())) {
        index = i;
        break;
      }
    }
    if (index != -1) {
      System.out.println(productsAndPrices[index].getSecond());
    } else {
      System.out.println("The product " + userChoice + " is absent");
    }
  }
}
