package homework49.task01;
/*
Взять ранее разработанный класс-коллекцию MyArray из пакета homework в текущем занятии.
Во всех случаях, где в методах класса происходят какие-то исключительные ситуации,
из-за которых метод не может дальше работать, выкидывать exception соответствующего типа.
Например, если указан отрицательный индекс, выкидывать IndexOutOfBoundsException.

Также создать класс Main и в методе main продемонстрировать три случая, где из объекта класса MyArray
будет выкинуто исключение. Словить и обработать эти исключения.
 */
public class Main {

  public static void main(String[] args) {
    MyArray<Integer> myArray = new MyArray<>();
    try {
      myArray.set(1, 9);
    } catch (IndexOutOfBoundsException ex) {
      System.out.println(ex.getMessage());
    }
    try {
      myArray.add(3, 7);
    } catch (IndexOutOfBoundsException ex) {
      System.out.println(ex.getMessage());
    }
    try {
      myArray.remove(4);
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
