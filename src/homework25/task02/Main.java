package homework25.task02;
/*
Создать класс Pen (ручка). Сделать свойство количество чернил, установить значение 1000
Описать метод write(String), который принимает строку и выводит ее в консоль.
При этом количество чернил должно уменьшаться на количество написанных символов.
Если в ручке недостаточно чернил, ручка не должна написать в консоль вообще ничего.
Описать метод refill(), который установит количество чернил обратно на 1000.
Описать метод checkInk(), который напишет в консоль, сколько в ручке осталось чернил.

Продемонстрировать работу объекта класса Pen в методе main() класса Main в свободной форме.
Главное условие - должны быть вызваны все методы класса.
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(scanner.nextLine());
    Pen pen = new Pen();
    pen.inkQuantity = 1000;
    pen.write(scanner.nextLine());
    pen.refillInk(pen.inkQuantity);
    pen.checkInkQuantity();

  }

}
