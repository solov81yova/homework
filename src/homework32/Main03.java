package homework32;
/*
Написать программу, которая запрашивает у пользователя число в диапазоне от 1 до 10 (включительо).
Если пользователь написал неподходящее число, программа спрашивает еще раз.
Таким образом, программа должна продолжать спрашивать, пока пользователь не введет подходящее число.
Пример окончательного вывода одной программы:
    Введите число от 1 до 10.
    -8
    Введите число от 1 до 10.
    111
    Введите число от 1 до 10.
    0
    Введите число от 1 до 10.
    4
    Вы ввели 4. Спасибо!
 */
import java.util.Scanner;

public class Main03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;
    do {
      System.out.println("Please, enter a number from 1 to 10!");
      number = scanner.nextInt();
    } while (number < 1 || number > 10);
    System.out.println("You input: " + number + ". " + "Thank you!");
  }
}
