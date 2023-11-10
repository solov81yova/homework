package homework26.task01;
/*
Скопировать классы из задания 25 задачи 01 в текущую папке.
Для класса Human описать конструктор с параметрами, который позволит инициализировать все поля,
передав значения как аргументы.
Переписать main таким образом, чтобы он использовал конструктор.
 */

public class Main {
  public static void introduce(Human human) {
    System.out.println("Hello, my name is " + human.name + "," + " im " + human.age + "!");
  }

  public static void main(String[] args) {
    Human anastasia = new Human("Anastasia", "36");

    Human vadim = new Human("Vadim", "19");

    Human marie = new Human("Marie", "28");

    introduce(anastasia);
    introduce(vadim);
    introduce(marie);
  }

}


