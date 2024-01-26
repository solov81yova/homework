package homework51.task01;
/*
Реализовать несколько методов, обрабатывающих строки.
Продемонстрировать работу каждого разработанного метода в методе main.
Список методов:
* boolean isPangram(String sentence);
    Проверяет, является ли строка sentence панграммой (на английском) и возвращает истину если это так.
    Справка: панграмма - такое предложение, в котором каждая буква алфавита использована один раз
    Пример: The quick brown fox jumps over the lazy dog
 */
import java.util.Scanner;

public class Pangram {

  public static boolean isPangram(String sentence) {
    for (char ch = 'a'; ch <= 'z'; ch++) {
      if (sentence.indexOf(ch) == -1) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String sentence = scanner.nextLine();
    System.out.println(isPangram(sentence));
  }
}
