package homework30;
/*
Создать переменные a, b, c и d и задать им какие-то значения из головы.
Посчитать результат выражения (записано математически): a(b-d)+ca/d
Вывести результат в консоль.
Пример вывода:
    Результат: 2,23
 */

public class Main02 {

  public static void main(String[] args) {
    int a = 13;
    double b = 5;
    int c = 7;
    double d = 8;
    double findResult = a * (b - d) + c * a / d;
    System.out.println("The result is: " + findResult);

  }

}
