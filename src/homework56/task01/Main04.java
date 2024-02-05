package homework56.task01;
/*
Напечатать "Хеш-таблицу"
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main04 {

  public static void main(String[] args) {
    Map<String, LinkedList<String>> hashTable = new HashMap<>();
    hashTable.computeIfAbsent("Apple", key -> new LinkedList<>()).add("2.0");
    hashTable.computeIfAbsent("Potato", key -> new LinkedList<>()).add("3.0");
    hashTable.computeIfAbsent("Grape", key -> new LinkedList<>()).add("2.5");
    hashTable.computeIfAbsent("Carrot", key -> new LinkedList<>()).add("1.5");
    hashTable.computeIfAbsent("Onion", key -> new LinkedList<>()).add("1.0");
    System.out.println("This is a hash-table:");
    for (Map.Entry<String, LinkedList<String>> entry : hashTable.entrySet()) {
      System.out.print("Key: " + entry.getKey() + ", Price: ");
      for (String value : entry.getValue()) {
        System.out.println(value + " ");
      }
    }
  }
}
