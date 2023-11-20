package homework29.task01;

/*
Создать перечисление "цвета светофора" с соответствующими элементами (три цвета).
Создать класс "Светофор" с полем "текущий цвет светофора" (использовать тип перечисления).
Определить для поля аксесоры. Конструктор - по желанию.
Определить в классе метод boolean canCrossTheRoad() который вернет true если на текущий цвет светофора можно
переходить дорогу и false в противном случае.
Продемонстрировать работу класса в Main
 */

import homework29.TrafficLightColor;

public class TrafficLight {

  //поле "текущий цвет светофора" класса "Светофор"
  private TrafficLightColor currentColor;

  //геттер
  public TrafficLightColor getCurrentColor() {
    return currentColor;
  }

  //сеттер, что на зеленый цвет светофора можно пересекать дорогу
  public void setCurTrafficLightColor(TrafficLightColor trafficLightColor) {
    this.currentColor = TrafficLightColor.GREEN;

  }

  // метод проверки разрешения пересекать дорогу
  public boolean canCrossTheRoad() {
    return currentColor == TrafficLightColor.GREEN;
  }
}




