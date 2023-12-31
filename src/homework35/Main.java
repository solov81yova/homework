package homework35;
/*
Создать файл класса и скопировать в него приведенный ниже код.
Исправить возможные ошибки в методах и/или описании класса (новые методы дописывать не нужно)
В классе Main в многострочном комментарии описать, где, по вашему мнению, можно использовать этот класс.
Также написать краткое Техническое Задание (ТЗ), которое больше всего подойдет для того, чтобы по нему другой
человек смог написать такой же класс.
В методе main привести простой пример использования объекта этого класса.
 */

public class Main {
  /*
  На мой взгяд, класс Лампочка можно использовать в промышленной, производственной отрасли
  (при сборке электрооборудования) и оптово-розничной торговле
  *********************************************************************************
  Техническое задание:
  Создать класс Лампочка.
  Задать следующие поля: "штрих-код", "производитель", "яркость","мощность","цвет лампочки","цена".
  Создать конструктор.
  Для полей "цена" и "штрих-код" создать методы доступа (аксессоры).
  Для остальных полей класса Лампочка задать аксессор получения значения поля.
  Продемонстрировать работу вызова обьекта класса в Main с помощью конструктора.
   */

  public static void main(String[] args) {
    LightBulb led = new LightBulb(456789, "Ukraine", 10, 5,
        "coldweit", 50);
    System.out.println("Barcode is: " + led.getBarcode());
    System.out.println("Manufacturer is: " + led.getManufacturer());
    System.out.println("Brightness is: " + led.getBrightness() + " Bт");
    System.out.println("Power is: " + led.getPower());
    System.out.println("Color is: " + led.getRgb());
    System.out.println("Price is: " + led.getPrice() + " UAH");
  }
}
