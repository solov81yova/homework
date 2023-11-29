package homework34;
/*
Пользователь вводит название месяца маленькими буквами.
Вывести сезон, в котором будет этот месяц.
Для этого сделать метод с оператором switch, который принимает и возвращает String
Пример:
    Ввод:
    декабрь
    Вывод:
    зима
 */

import java.util.Scanner;

public class Main01_34 {

  public static String guessSeason(String month) {
    switch (month) {
      case "december":
      case "january":
      case "february":
        return "winter";
      case "march":
      case "april":
      case "may":
        return "spring";
      case "june":
      case "july":
      case "august":
        return "summer";
      case "september":
      case "october":
      case "november":
        return "autumn";
      default:
        return "This month is absent. Check your input";
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String month = scanner.nextLine();
    System.out.println(guessSeason(month));
  }
}
