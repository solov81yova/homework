package homework40.task01;
/*
Взять свой класс из задания 39.
Описать для него метод equals и hashCode.
В main создать два объекта с одинаковыми значениями полей. Сравнить их методом equals.
Удостовериться в том что результат - true.
Изменить какое-то значение в одном из объектов. Сравнить объекты еще раз.
Удостовериться в том что результат - false.

Вывод должен быть:
    true
    false
 */

public class Main {

  public static void main(String[] args) {
    Dishwasher dishwasher1 = new Dishwasher("Miele", 60, 80, 14,
        'A', 'A', "intensive drying");
    Dishwasher dishwasher2 = new Dishwasher("Miele", 60, 80, 14,
        'A', 'A', "intensive drying");
    System.out.println(dishwasher1.equals(dishwasher2));
    dishwasher1.setModel("Siemens");
    System.out.println(dishwasher1.equals(dishwasher2));
  }
}

