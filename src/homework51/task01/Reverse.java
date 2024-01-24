package homework51.task01;
/*
Реализовать несколько методов, обрабатывающих строки.
Продемонстрировать работу каждого разработанного метода в методе main.
Список методов:
String reverse(String text);
    Разворачивает строку text. Например, строка Hello world должна быть превращена в dlrow olleH
 */
import java.util.Scanner;

public class Reverse {

  public static String reverse(String text) {
    StringBuilder sb = new StringBuilder(text);//создаем обьект,который будет принимать строку
    sb.reverse();//делаем разворот строки
    return sb.toString();//возвращаем полученную строку
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    System.out.println(reverse(text));
  }
}
