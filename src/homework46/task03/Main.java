package homework46.task03;
/*
Запросить у пользователя количество элементов массива.
Создать массив с таким размером и заполнить его случайными значениями от 0 до 100
Вывести массив на экран.
Отсортировать массив в порядке спадания, т.е. чтобы он начинался самым большим элементом и
заканчивался самым маленьким.
Выделить некоторые части кода в отдельные методы. Должны получиться такие методы:
1 Заполнение переданного массива случайными значениями
2 Печать массива в консоль
3 Сортировка массива
Подсказка: массив не нужно возвращать из метода. Все изменения которые вы сделаете над элементами массива внутри метода
сохранятся и в Main
 */
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static int[] getRandomArray(int[] arr, int min, int max) {
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100);
    }
    return arr;
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void sortTheArray(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[index] < arr[j]) {
          index = j;
        }
      }
      if (index == i) {
        continue;
      }
      int temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int amount = scanner.nextInt();
    int[] array = new int[amount];
    getRandomArray(array, 0, 100);
    printArray(array);
    sortTheArray(array);
    System.out.println();
    printArray(array);
  }
}
