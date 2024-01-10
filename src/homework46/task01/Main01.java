package homework46.task01;
/*
Считать последовательность чисел, вводимую пользователем в консоли.
Последовательность заканчивается когда пользователь вводит ноль.
Посчитать и вывести среднее арифметическое всех введенных пользователем чисел.
Тип данных float или double

Дополнительное задание: записать все введенные числа в массив, вывести этот массив перед результатом
Пример (с доп. заданием):
    Ввод:
    1.5 2.6 3.7 4.1 5.9 0
    Вывод:
    1.5 2.6 3.7 4.1 5.9
    3.56
 */
import java.util.Scanner;

public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] numbers = new double[10];
    double sum = 0;
    int count = 0;
    while (true) {
      double n = scanner.nextDouble();
      if (n == 0) {
        break;
      }
      numbers[count] = n;
      sum += n;
      count++;
    }
    for (int i = 0; i < count; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();
    double average = sum / count;
    System.out.println(average);
  }
}
