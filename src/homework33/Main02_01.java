package homework33;
/*
Дополнительное задание:
Разработать метод, возвращающий массив типа String,
в котором записан английский алфавит (маленькими буквами)
 */
public class Main02_01 {

  public static String[] getAlphabet() {
    String[] alphabet = new String[26];//задаю массив размером в 26 букв
    char letter = 'a'; //задаю первую букву
    for (int i = 0; i < 26; i++) {
      alphabet[i] = String.valueOf(letter);//передаю в массив буквенные значения
      letter++;
    }
    return alphabet;
  }

  public static void main(String[] args) {
    String[] alphabet = getAlphabet();//заполняю массив буквами алфавита
    for (int i = 0; i < 26; i++) {
      System.out.print(alphabet[i] + " ");//вывожу на печать массив букв
    }
  }
}
