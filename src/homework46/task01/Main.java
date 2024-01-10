package homework46.task01;
/*
Считать последовательность чисел, вводимую пользователем в консоли.
Последовательность заканчивается когда пользователь вводит ноль.
Посчитать и вывести среднее арифметическое всех введенных пользователем чисел.
Тип данных float или double
Пример:
    Ввод:
    1.5 2.6 3.7 4.1 5.9 0
    Вывод:
    3.56
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double sum = 0;
    double n = scanner.nextDouble();
    int count = 0;
    while (n != 0) {
      sum += n;
      n = scanner.nextDouble();
      count++;
    }
    double average = sum/count;
    System.out.println(average);
  }
}
