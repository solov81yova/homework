package homework28;

public class MyArray {

  private double[] array;

  //конструктор по умолчанию
  public MyArray() {
    array = new double[0];//размер не известен, нет элементов
  }

  // конструктор с параметрами
  public MyArray(double[] array) {
    this.array = new double[array.length];
    copy(array, this.array);
  }

  // метод копирования элементов из одного массива в другой
  private void copy(double[] src, double[] dst) {
    for (int i = 0; i < src.length; i++) {
      dst[i] = src[i];
    }
  }

  //метод для получения значения элемента по индексу
  public double get(int index) {
    return array[index];// элемент по индексу
  }

  //метод для изменения значения элемента по индексу
  public void set(int index, double value) {
    array[index] = value;
  }

  //метод, который возвращает размер массива
  public int size() {
    return array.length;
  }

  // метод поиска индекса элемента по значению
  public int indexOf(double val) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == val) {
        return i;
      }
    }
    return -1;
  }

  // метод добавления элемента по индексу
  public void add(int index, double val) {
    if (index < 0 || index > array.length) {
      return;
    }
    double[] newArray = new double[array.length + 1];
    copy(array, newArray);
    for (int i = newArray.length - 1; i > index; i--) {
      newArray[i] = newArray[i - 1];
    }
    newArray[index] = val;
    array = newArray;
  }

  // метод удаления элемента по индексу
  public void remove(int index) {
    if (index < 0 || index >= array.length) {
      return;
    }
    double[] newArray = new double[array.length - 1];
    for (int i = 0; i < newArray.length; i++) {
      if (i < index) {
        newArray[i] = array[i];
      } else {
        newArray[i] = array[i + 1];
      }
    }
    array = newArray;// замена старого массива на новый
  }

  //метод на проверку true, если значение val есть в этом массиве,
// false в противном случае
  public boolean contains(double val) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == val) {
        System.out.println("The value is: " + val);
        return true;
      }
    }
    System.out.println("The value is absent");
    return false;
  }

  //метод на проверку пустоты массива
  public boolean isEmpty() {
    if (array.length == 0) {
      System.out.println("The array is empty");
      return true;
    }
    System.out.println("The array is not empty");
    return false;
  }

  // метод добавления элемента со значением val в конец массива
  public void add(double val) {
    double[] newArray = new double[array.length + 1];
    copy(array, newArray);
    newArray[array.length] = val;
    array = newArray;
  }

  //метод удаления последнего элемента из массива
  public void removeLast() {
    double[] newArray = new double[array.length - 1];
    for (int i = 0; i < newArray.length; i++) {
      if (i < array.length) {
        newArray[i] = array[i];
      } else {
        newArray[i] = array[i + 1];
      }
    }
    array = newArray;
  }


  //метод замены значения val в массиве на значение newVal
  public void replace(double val, double newVal) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == val) {
        array[i] = newVal;
      }
    }
  }

  //метод удаления первого значения из массива, равное переданному
  public void remove(double val) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == val) {
        double[] newArray = new double[array.length + 1];
        copy(array, newArray);
        break;
      }
    }
  }

  public String toString() {
    String res = "[ ";
    for (int i = 0; i < array.length; i++) {
      res += array[i];
      if (i != array.length - 1) {
        res += ", ";
      }
    }
    res += " ]";
    return res;
  }
}

