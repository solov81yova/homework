package homework31;
/*
Скопировать код из задания 30 задачи 02 (там где формула).
Сделать так, чтобы числа вводились пользователем в консоли.
Пример выполнения:
    Ввод:
    5
    7
    2
    3
    Вывод:
    46.6666666
 */
import java.util.Scanner;

public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    double b = scanner.nextDouble();
    int c = scanner.nextInt();
    double d = scanner.nextDouble();
    double findResult = a * (b - d) + c * a / d;
    System.out.println("The result is: " + findResult);
  }

}
