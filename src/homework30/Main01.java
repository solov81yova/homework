package homework30;
/*
Существует три типа примитивных данных:
Числовые:
Целые -> byte(8 bits or 1 byte), int(15 (32 bits or 4 bytes)), short(16 bites or 2 bytes), long(когда int недостаточно для хранения значения)
С плавающей точкой(нецелые) -> double(2.4), float(4f, 34.5f)
Символьные: char 'A', String
Логический: boolean(true or false)
 */
public class Main01 {
/*
Создать целочисленную, нецелую, символьную и логическую переменную.
Вывести в консоль значение и размер каждой переменной.
Написать в комментарии в коде все примитивные типы данных, которые вы знаете.
Пример вывода:
    Целый: 15, 4 байта
    Нецелый: 6,12, 8 байт
    Символьный: A, 1 байт
    Логический: true, 1 байт
 */
  public static void main(String[] args) {
    int number1 = 15;
    System.out.println("Type int: " + number1 + ", " + "size: 4 bytes");
    double number2 = 6.12;
    System.out.println("Type double: " + number2 + ", " + "size: 8 byte");
    char Char = 'A';
    System.out.println("Type char: " + Char + ", " + "size: 1 byte");
    boolean type = true;
    System.out.println("Type boolean: " + type + ", " + "size: 1 byte");
  }

}
