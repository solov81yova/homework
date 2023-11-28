package homework33;
/*
Разработать метод, изменяющий знаки всех элементов целочисленного массива на противоположные
Продемострировать работу метода в свободной форме
Пример:
    Вводные данные: 1 5 7 -4 8 -3 -6
    Результат: -1 -5 -7 4 -8 3 6
 */
public class Main01 {

  public static void changeSign(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] < 0 ? Math.abs(arr[i]) : -arr[i];//заменяю отрицательные числа на их модуль,
      // т.е. абсолютную величину, в противном случае, заменяю положительные числа на их
      // отрицательное значение
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 5, 7, -4, 8, -3, -6, 8, -13, 23, -75, -65};
    changeSign(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

