package homework44.task02;
/*
Ваша компания по какой-то причине захотела, чтобы в программе можно было изменить размер участка, периметр
которого вы считаете, после факта подсчета, и потом пересчитать еще раз.

Скопировать код из предыдущего задания.
Разработать интерфейс Resizable, который опишет метод resize(double coefficient).
Изменить класс Shape так, чтобы он реализовывал этот интерфейс.
Реализовать добавленный интерфейсом метод в неабстрактных классах-наследниках класса Shape.
Этот метод должен пропорционально увеличивать размер фигуры.
Например, если этот метод вызвать на прямоугольнике со сторонами 4 и 5, передав 2,
стороны должны стать 8 и 10
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
      System.out.println("Enter the increase coefficient:");
      double coefficient = scanner.nextDouble();
      shape.resize(coefficient);
      System.out.println(shape);
      System.out.println(shape.getPerimeter());
      System.out.println("The total price with coefficient: " + totalPrice * coefficient + " euro");

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
      System.out.println("Enter the increase coefficient:");
      double coefficient = scanner.nextDouble();
      shape.resize(coefficient);
      System.out.println(shape);
      System.out.println(shape.getPerimeter());
      System.out.println("The total price with coefficient: " + totalPrice * coefficient + " euro");

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
      System.out.println("Enter the increase coefficient:");
      double coefficient = scanner.nextDouble();
      shape.resize(coefficient);
      System.out.println(shape);
      System.out.println(shape.getPerimeter());
      System.out.println(
          "The total price with coefficient: " + shape.getPerimeter() * coefficient + " euro");
    } else {
      System.out.println("This shape is absent");
    }
  }
}
