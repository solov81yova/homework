package homework26.task02;
/*
Творческое задание

Разработать любой класс на ваше усмотрение, который описывает любой предмет из реальной жизни.
Классы, которые рассматривались на лекциях, приниматься не будут.
Для него сделать нужные поля, конструктор с параметрами и конструктор по умолчанию.
Также указать методы по желанию.
Примеры (идеи): бутылка, домашнее животное, кружка, электрический кабель, чайник,
обои, лампа, коробка, овощ, товар (в магазине), ткань, кровать.
Главное в выборе примера: чтобы у предмета было больше трех важных характеристик, и они были
не только типа String
 */

public class Main {

  public static void printDishwasherInfo(Dishwasher dishwasher) {
    System.out.println("Model: " + dishwasher.model);
    System.out.println("Width: " + dishwasher.width);
    System.out.println("Height: " + dishwasher.height);
    System.out.println("Capacity: " + dishwasher.capacity);
    System.out.println("Class energy: " + dishwasher.energyClass);
    System.out.println("Class washing: " + dishwasher.washClass);
    System.out.println("Class drying: " + dishwasher.dryingClass);
  }
  public static void main(String[] args) {

    Dishwasher dishwasher = new Dishwasher("Miele", 60, 80, 14,
        'A', 'A', "intensive drying");
    printDishwasherInfo(dishwasher);
    System.out.println();
    Dishwasher dishwasher1 = new Dishwasher();
    printDishwasherInfo(dishwasher1);
  }
}
