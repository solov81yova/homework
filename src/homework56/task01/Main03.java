package homework56.task01;
/*
Из строки сделать аббревиатуру
 */
import java.util.Scanner;

public class Main03 {
public static String abbreviation (String input) {
  String[] words = input.split("\\s+");
  StringBuilder sb = new StringBuilder();
  for (String word : words) {
    if (!word.isEmpty()) {
      sb.append(word.charAt(0));
    }
  }
  return sb.toString().toUpperCase();
}
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    System.out.println(abbreviation(line));
  }
}
