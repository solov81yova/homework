package homework51.task01;
/*
Реализовать несколько методов, обрабатывающих строки.
Продемонстрировать работу каждого разработанного метода в методе main.
Список методов:
int countOccurencies(String text, char letter);
    Считает сколько раз символ letter появляется в строке text и возвращает это число.
    Возвращает 0 если переданная строка равна null, пуста, либо этого символа нет в строке.
 */

import java.util.Scanner;

public class CountSymbol {

  public static int countOccurencies(String text, char letter) {
    if (text == null || text.isEmpty()) {
      return 0;
    }
    int count = 0;
    for (Character ch : text.toCharArray()) {
      if (ch == letter) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    System.out.println(countOccurencies(text, 'a'));
  }
}
