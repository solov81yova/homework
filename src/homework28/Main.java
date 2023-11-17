package homework28;

public class Main {

  public static void main(String[] args) {
    double[] arr = {4, 2, 7, 1, -5, 6};
    MyArray myArray = new MyArray(arr);
    myArray.set(myArray.indexOf(1), 10);
    myArray.add(myArray.indexOf(7), 123 );
    myArray.remove(myArray.indexOf(7));
    myArray.contains(6);
    myArray.isEmpty();
    myArray.add(11);
    myArray.removeLast();
    myArray.replace(4, 88);
    myArray.remove(1);
    System.out.print(myArray);
  }

}
