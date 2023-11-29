package homework34.task02;
/*
Создать перечисление "Планеты солнечной системы", перечислить в нем все планеты.

Для перечисления указать поле название планеты, конструктор, в который можно передать название.

В классе Main сделать метод, который выведет тип планеты:
Безжизненный камень, обитаемаая планета, газовый гигант или ледяная планета.
В методе main предложить пользователю выбрать планету и в ответ вывести класификацию этой планеты,
используя разработанный ранее метод.

Обратите внимание: плутон не считается планетой, так как находится в поясе Койпера,
где были найдены планетоиды больших размеров
Пример:
    Вывод:
    Напишите номер планеты.
    Ввод:
    5
    Вывод:
    Вы выбрали планету Юпитер
    Класс: газовый гигант
 */

import java.util.Scanner;

public class Main {

  public static String identifyTypePlanet(PlanetOfTheSolarSystem planet) {
    switch (planet) {
      case EARTH:
        return "обитаемая планета";
      case MERCURY:
      case VENUS:
      case MARS:
        return "безжизненный камень";
      case JUPITER:
      case SATURN:
        return "газовый гигант";
      case URANUS:
      case NEPTUNE:
        return "ледяная планета";
      default:
        return "This number is absent. Try again!";
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose the number of the planet");
    int digit = scanner.nextInt();
    if (digit >= 1 && digit <= 8) {
      PlanetOfTheSolarSystem[] planets = PlanetOfTheSolarSystem.values();
      PlanetOfTheSolarSystem choice = planets[digit];
      System.out.println("You choose the planet: " + choice.getName());
      System.out.println("The class is: " + identifyTypePlanet(planets));

    }

  }
}


