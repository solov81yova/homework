package homework51.task01;
/*
Реализовать несколько методов, обрабатывающих строки.
Продемонстрировать работу каждого разработанного метода в методе main.
Список методов:
* String wordReverse(String text);
    Разворачивает порядок слов в строке text (слова разделены пробелами).
    Например, для ввода What a wonderful day результат будет day wonderful a What
 */
import java.util.Scanner;

public class WordReverse {

  public static String wordReverse(String text) {
    //разделяем строку text на подстроки, используя символ пробела в качестве разделителя
    // и сохраняем эти подстроки в массив
    String[] words = text.split("\\s+");
    StringBuilder sb = new StringBuilder(text);//создаем обьект,который будет принимать строку
    for (int i = words.length - 1; i >= 0; i--) { //итерация в обратном порядке
      sb.append(" ").append(words[i]);
    }
    return sb.toString(); //возвращаем полученную строку
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    System.out.println(wordReverse(text));
  }
}
