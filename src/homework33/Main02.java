package homework33;
/*
Разработать метод, возвращающий массив типа char,
в котором записан английский алфавит (маленькими буквами)
 */
public class Main02 {

  // метод получения алфавита
  public static void getAlphabet(char[] alphabet) {
    char letter = 'a'; //задаю первую букву
    for (int i = 0; i < 26; i++) {
      alphabet[i] = letter;//получаю буквы алфавита
      letter++;
    }
  }

  public static void main(String[] args) {
    char[] alphabet = new char[26];//массив алфавита из 26 букв
    getAlphabet(alphabet);//заполняю массив буквами
    for (int i = 0; i < 26; i++) {
      System.out.print(alphabet[i] + " ");//печатаю массив букв
    }
  }
}
