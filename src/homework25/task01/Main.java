package homework25.task01;
/*
Создать класс Human. Для него указать свойства имя и возраст
В классе, описать метод introduce(), где объект представится, выведя информацию про себя в консоль
Создать класс Main, в нем, в методе main(), создать три экземпляра класса Human,
для них задать разные имена и возраста.
Вызвать метод introduce() для каждого объекта по очереди.

Пример вывода:
    Привет, меня зовут Настя, мне 36!
    Привет, меня зовут Вадим, мне 19!
    Привет, меня зовут Мария, мне 28!
 */
public class Main {

  public static void main(String[] args) {
    Human anastasia = new Human();
    anastasia.name = "Anastasia";
    anastasia.age = "36";
    Human vadim = new Human();
    vadim.name = "Vadim";
    vadim.age = "19";
    Human marie = new Human();
    marie.name = "Marie";
    marie.age = "28";
    anastasia.introduce();
    vadim.introduce();
    marie.introduce();
  }

}
