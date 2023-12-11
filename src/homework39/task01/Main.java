package homework39.task01;
/*
Творческое задание

Разработать любой класс на ваше усмотрение, который описывает любой предмет из реальной жизни.
Для него сделать нужные поля, конструктор с параметрами, конструктор по умолчанию и аксессоры.
Переопределить метод toString.
В main показать превращение объекта в строку и вывод его в консоль.

Примеры (идеи): бутылка, домашнее животное, кружка, электрический кабель, чайник,
обои, лампа, коробка, овощ, товар (в магазине), ткань, кровать.

Главное в выборе примера, это чтобы у предмета было больше трех важных характеристик, обязательно наличие
хотябы одного поля типа int и хотябы одного поля типа String
 */

public class Main {


  public static void main(String[] args) {
    Dishwasher dishwasher = new Dishwasher("Miele", 60, 80, 14,
        'A', 'A', "intensive drying");
    System.out.println("Information about the dishwasher: ");
    System.out.print(dishwasher);
    System.out.println();
    System.out.println("Information about the dishwasher: ");
    Dishwasher dishwasher1 = new Dishwasher("Siemens", 45, 80, 10,
        'A', 'B', "turbo drying");
    System.out.print(dishwasher1);
  }
}
