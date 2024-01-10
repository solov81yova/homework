package homework46.task02;
/*
Спросить у пользователя номер дня недели и вывести название этого дня недели в консоль.
Программа не должна принимать числа, которые находятся не в диапазоне от 1 до 7.
Т.е., должна переспрашивать число, если оно введено неправильно.
Для реализации превращения числа в название написать метод, в котором используется switch
Пример:
  Ввод:
  4
  Вывод:
  Четверг
 */
import java.util.Scanner;

public class Main {

  public static String printDayOfTheWeek(int number) {
    switch (number) {
      case 1:
        return "Monday";
      case 2:
        return "Tuesday";
      case 3:
        return "Wednesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      case 6:
        return "Saturday";
      case 7:
        return "Sunday";
      default:
        return "This number of the week is absent. Check your input!";
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(printDayOfTheWeek(number));
  }
}
