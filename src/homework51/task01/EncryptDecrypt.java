package homework51.task01;
/*
Реализовать несколько методов, обрабатывающих строки.
Продемонстрировать работу каждого разработанного метода в методе main.
Список методов:
String encrypt(String text);
    Шифрует строку text таким образом, чтобы ее нельзя было с легкостью прочитать.
    Можно использовать любой метод шифрования, либо взять предложенный.
    Предложенный метод: метод Цезаря. Все буквы сдвигаются на 3 вперед по алфавиту для зашифровки и на 3 назад
    по алфавиту для расшифровки.
    Подсказка: табличка ASCII

    String decrypt(String data);
    Делает противоположное действие со строкой data к тому, которое было сделано в методе encrypt().
    Таким образом, происходит расшифровка, и должно быть получено исходное сообщение
 */
import java.util.Scanner;

public class EncryptDecrypt {
//метод, принимающий строку text и возвращающий зашифрованную строку
  public static String encrypt(String text) {
    StringBuilder sb = new StringBuilder();//создаем обьект,который будет хранить строку
    // проходим по всей строке
    for (Character ch : text.toCharArray()) {
      sb.append((char) (ch + 3));//шифруем символ путем смещения вправо на три позиции
    }
    return sb.toString();//возвращаем полученную строку
  }
//метод, принимающий строку data и возвращающий дешифрованную строку
  public static String decrypt(String data) {
    StringBuilder sb = new StringBuilder();//создаем обьект,который будет хранить дешифрованную строку
    // проходим по всей строке
    for (Character ch : data.toCharArray()) {
      sb.append((char)(ch - 3)); // делаем смещение на три позиции назад
    }
    return sb.toString();//возвращаем исходную строку
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    System.out.println(encrypt(text));
    System.out.println(decrypt(encrypt(text)));
  }
}
