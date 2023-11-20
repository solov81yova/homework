package homework30;
/*
этот код с методом написала для себя для тренировки
 */

public class Main01_01 {
  public static void identifyType(int number1) {
    System.out.println("This is a type int: " + number1 + ", " + "size: 4 bytes");
  }
  public static void identifyType(double number2) {
    System.out.println("This is a type double: " + number2 + ", " + "size: 8 bytes");
  }
  public static void identifyType(char Char) {
    System.out.println("This is a type char: " + Char + ", " + "size: 1 byte");
  }
  public static void identifyType(boolean type) {
    System.out.println("This is a type boolean: " + type + ", " + "size: 1 byte");
  }
  public static void main(String[] args) {
    int number1 = 15;
    double number2 = 6.12;
    char Char = 'A';
    boolean type = true;
    identifyType(number1);
    identifyType(number2);
    identifyType(Char);
    identifyType(type);
    }
  }

