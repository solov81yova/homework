package homework32;
/*
Написать программу, которая выведет таблицу умножения числа, которое введет пользователь.
Напечатать полностью примеры.
Пример:
    Ввод:
    4
    Вывод:
    4 * 1 = 4
    4 * 2 = 8
    4 * 3 = 12
    4 * 4 = 16
    4 * 5 = 20
    4 * 6 = 24
    4 * 7 = 28
    4 * 8 = 32
    4 * 9 = 36
    4 * 10 = 40
 */
import java.util.Scanner;

public class Main02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
      int res = number * i;
      System.out.println(number + " * " + i + " = " + res);
    }
  }
}
