package homework56.task01;

import java.util.Comparator;
import java.util.List;
/*
Проверить, будут ли все строки в списке больше 10 символов в длину
 */

public class Main02 {

  public static void main(String[] args) {

    List<String> lines = List.of("Hello", "Hello world", "World is beautiful", "Hello beautiful world");
    boolean linesLongerThan10 = lines.stream().allMatch(line -> line.length() > 10);
    if (linesLongerThan10) {
      System.out.println("All lines longer than 10 symbols");
    } else {
      System.out.println("There are some lines shorter or longer than 10 symbols");
    }
  }
}