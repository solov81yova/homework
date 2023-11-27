package homework33;
/*
Генератор чисел Фибоначчи

Разработать метод, который сгенерирует первые n чисел последовательности фибоначчи.
n передать как параметр в метод.
Результат нужно записать в массив и вернуть этот массив.
Последовательность фибоначчи это такая последовательность, в которой первые числа 0 и 1, и каждое следующее число
это сумма предыдущих двух чисел.
Продемострировать работу метода в свободной форме.
 */

import java.util.Scanner;

public class Main03 {
// метод для генерации чисел Фибоначчи, где каждое следующее число
// равно сумме двух предыдущих чисел
  public static void fibonacciNumbers(int n, int[] arr) {
    for (int i = 2; i < arr.length; i++) {//начинаю со второго индекса,т.к.первые два числа известны
      arr[i] = arr[i - 1] + arr[i - 2];
    }
  }
//метод вывода на печать полученного массива чисел
  public static void printFibonacciNumbers(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");

    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    arr[0] = 0;
    arr[1] = 1;
    fibonacciNumbers(n, arr);
    printFibonacciNumbers(arr);
  }
}
