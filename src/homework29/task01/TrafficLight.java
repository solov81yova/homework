package homework29.task01;
/*
Создать перечисление "цвета светофора" с соответствующими элементами (три цвета).
Создать класс "Светофор" с полем "текущий цвет светофора" (использовать тип перечисления).
Определить для поля аксесоры. Конструктор - по желанию.
Определить в классе метод boolean canCrossTheRoad() который вернет true если на текущий цвет светофора можно
переходить дорогу и false в противном случае.
Продемонстрировать работу класса в Main
 */
public class TrafficLight {
  //поле "текущий цвет светофора" класса "Светофор"
  private String curTrafficLightColor;

  //констуктор класса
  public TrafficLight(String curTrafficLightColor) {
    this.curTrafficLightColor = curTrafficLightColor;
  }
  //геттер
  public  String getCurTrafficLightColor () {
    return curTrafficLightColor;
  }
  //сеттер, что на зеленый цвет светофора можно пересекать дорогу
  public void setCurTrafficLightColor() {
    this.curTrafficLightColor = "green";

  }
  // метод проверки разрешения пересекать дорогу
public boolean canCrossTheRoad() {
    return curTrafficLightColor.equals("green");
  }
}
