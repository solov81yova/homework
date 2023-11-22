package homework31;
/*
"Кости"

Сделать программу, которая будет выкидывать кости.
Сначала программа должна спросить сколько костей выкидывать.
Если пользователь вводит 1 или 2, программа кидает соответствующее количество костей.
В противном случае, программа должна написать, что у нее нет такого количества костей.
В качестве "выкидывания костей" просто вывести нужное количество значений от 1 до 6.

Напоминание: игральные кости - кубик, на каждой стороне которого написаны числа в какой-либо форме.
Обычно это числа от 1 до 6
 */

import java.util.Random;
import java.util.Scanner;

public class Main02 {

  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many dices would you like to throw?");
    int number = 1 + random.nextInt(6 - 1);
    while (true) {
      int dice = scanner.nextInt();
      if (dice == 1) {
        System.out.println("You throw " + dice + " dice");
        System.out.println("The number is: " + number);
        break;
      } else if (dice == 2) {
        System.out.println("You throw " + dice + " dices");
        System.out.println("The number is: " + number + " and " + number);
        break;
    } else {
        System.out.println("I do not have this quantity of dices");

      }
    }
  }
}
