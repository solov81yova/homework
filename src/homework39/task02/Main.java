package homework39.task02;
/*
Создать класс Сотрудник, описать поля Имя, Зарплата и Должность.
Должность должна быть финальным полем.
Унаследовать от Сотрудника класс Разработчик, добавить ему метод "работать", который просто будет
выводить в консоль сообщение о том что разработчик усердно трудится над новой фичей.
Также унаследовать от Сотрудника класс Менеджер, добавить ему метод "заставить остальных работать",
который будет выводить в консоль грозный призыв ко всем разработчикам приступать к работе.

Обратите внимание: в конструкторы дочерних классов не нужно передавать должность.

Во всех классах переопределить toString.
В main создать массив типа Сотрудник, записать в него одного менеджера и 9 разработчиков
со случайными именами и зарплатой.
В Main создать метод "начать работу", который приймет массив сотрудников, и вызовет соответствующие методы
у каждого сотрудника (работать у разработчика, заставлять работать у менеджера)
 */

public class Main {

  public static void startWork(Employee employee) {
    if (employee instanceof Developer) {
      System.out.println("I am working now");
    }
    if (employee instanceof Manager) {
      System.out.println("I am keeping an eye on you");
    }
    employee.makeWork();
  }

  public static void main(String[] args) {
    Employee[] employees = new Employee[10];
    String[] names = {"Ivan", "Zlata", "Zoia", "Nikolay", "Sergey",
        "Gleb", "Max", "Darina", "Olga", "Tania"};
    for (int i = 0; i < employees.length; i++) {
      if (i < 9) {
        employees[i] = new Developer(names[i], 3500);
      } else {
        employees[i] = new Manager(names[i], 5000);
      }
    }
    for (int i = 0; i < employees.length; i++) {
      startWork(employees[i]);
    }
  }
}