package homework56.task01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
Подсчитать сколько раз слово встречается в списке строк
 */

public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String searchWord = scanner.next();
    List<String> lines = List.of("Hello world", "World is beautiful", "Hello beautiful world");

    long countWord = lines.stream().mapToLong(line -> Arrays.stream(line.split("\\s+"))
        .filter(word -> word.equalsIgnoreCase(searchWord)).count()).sum();
    System.out.println("The word " + searchWord + " appears " + countWord + " times");




  }

}
