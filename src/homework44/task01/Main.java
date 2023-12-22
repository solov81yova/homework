package homework44.task01;
/*
Вы работаете в фирме по изготовлению и установке заборов.
В вашей компании есть возможность заказать заборы на участки круглой,
прямоугольной и многоугольной формы. Разработайте программу, в которой
можно будет посчитать цену забора на участок.
Программа должна спрашивать форму участка, размеры участка в метрах и цену за метр забора.

Для выполнения задания создать абстрактный класс Shape, в нем описать абстрактный метод getPerimeter

Создать классы Прямоугольник, Круг и Правильный многоугольник, которые наследуют этот класс.

Справка: Правильный многоугольник - такая фигура, у которой неопределенное
количество сторон, но все эти стороны равны между собой, и сложены таким образом, что все углы
в многоугольнике равны.
Подсказка: это значит, что у многоугольника должно быть два свойства: количество сторон и длинна одной стороны

В Main написать саму программу, которая при запуске спрашивает все что нужно, создает нужный объект и считает
периметр участка. Рассчет цены должен также происходить в Main.
Введение формы участка реализовать одним из двух способов:
1 Считывать название формы как строку
2 Вывести в консоль пронумерованный список доступных форм, и считывать номер формы (на подобии меню)
 */
import java.util.Scanner;

public class Main {

  public static void chooseShape() {
    System.out.println("1. Rectangle");
    System.out.println("2. Circle");
    System.out.println("3. RegularPolygon");
  }

  public static void main(String[] args) {
    System.out.println("Please enter the number of the figure: ");
    chooseShape();
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    if (choice == 1) {
      System.out.println("You choose shape: Rectangle");
      System.out.println("Enter length and width:");
      double length = scanner.nextDouble();
      double width = scanner.nextDouble();
      Shape shape = new Rectangle(length, width);
      System.out.println(shape);
      System.out.println("Perimeter is: " + shape.getPerimeter() + " m");
      System.out.println("Enter the price per meter:");
      double price = scanner.nextDouble();
      double totalPrice = shape.getPerimeter() * price;
      System.out.println("The total price is: " + totalPrice + " euro.");
    } else if (choice == 2) {
      System.out.println("You choose shape: Circle");
      System.out.println("Enter the radius length:");
      double radius = scanner.nextDouble();
      Shape shape = new Circle(radius);
      System.out.println(shape);
      System.out.println("Perimeter is: " + shape.getPerimeter() + " m");
      System.out.println("Enter the price per meter:");
      double price = scanner.nextDouble();
      double totalPrice = shape.getPerimeter() * price;
      System.out.println("The total price is: " + totalPrice + " euro.");
    } else if (choice == 3) {
      System.out.println("You choose shape: Regular polygon");
      System.out.println("Enter number of sides and length: ");
      int numberOfSides = scanner.nextInt();
      double length = scanner.nextDouble();
      Shape shape = new RegularPolygon(numberOfSides, length);
      System.out.println(shape);
      System.out.println("Perimeter is: " + shape.getPerimeter() + " m");
      System.out.println("Enter the price per meter:");
      double price = scanner.nextDouble();
      double totalPrice = shape.getPerimeter() * price;
      System.out.println("The total price is: " + totalPrice + " euro.");
    } else {
      System.out.println("This shape is absent");
    }
  }
}






