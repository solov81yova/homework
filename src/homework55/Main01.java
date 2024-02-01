package homework55;
/*
Считывать из консоли поочерёдно строки и числа.
Строка будет обозначать дело, а число - количество времени в минутах, которое надо потратить на
это дело.
Дела и время нужно сохранять в HashMap.
Вывести назад в консоль количество дел, список дел вместе с временем и сколько времени
понадобится, чтобы выполнить все дела.
Ввод заканчивается когда пользователь вводит слово "конец" (либо end, если программа написана
на английском).
После слова "конец" программа не должна спрашивать количество времени.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main01 {

  public static void main(String[] args) {
    Map<String, Integer> cases = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    String caseToDo;

    while (true) {
      System.out.println("Enter a list cases: ");
      caseToDo = scanner.nextLine();
      if (caseToDo.equals("end")) {
        break;
      } else {
        System.out.println("It takes minutes: ");
        int minutes = scanner.nextInt();
        scanner.nextLine();
        cases.put(caseToDo, minutes);
      }
    }
    System.out.println("Total number of cases for today: " + cases.size());
    for (String key : cases.keySet()) {
      System.out.println(key);
    }
    System.out.println("List of cases for today in minutes: ");
    for (var entry : cases.entrySet()) {
      System.out.println(entry.getKey() + ", it takes: " + entry.getValue() + " minutes");
    }
    int totalTime = 0;
    for (int minutes : cases.values()) {
      totalTime += minutes;
    }
    System.out.println("Total time to complete to-do list: " + totalTime + " minutes");
  }
}







