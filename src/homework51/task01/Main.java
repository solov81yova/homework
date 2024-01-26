package homework51.task01;
/*
Реализовать несколько методов, обрабатывающих строки.
Методы с особой сложностью обозначены звездочками. Вы должны обязательно выполнить   один
из сложных методов для принятия задания.
Продемонстрировать работу каждого разработанного метода в методе main.
Список методов:

    boolean isPalindrome(String word);
    Проверяет, является ли строка word палиндромом (т.е. можно ли ее одинаково прочитать с начала в конец и с конца в
    начало), игнорируя регистр букв
    Примеры палиндромов (для этих вводов true): 12:21, тенет, Пилип
    Обратите внимание, что, к примеру, "А роза упала на лапу Азора" не будет палиндромом в нашей программе, так как
    в этой строке палиндромными будут только буквы, но не пробелы.
    Дополнительное задание: сделать так, чтобы знаки препинания и пробелы не мешали определению палиндрома

    * boolean isPangram(String sentence);

    Проверяет, является ли строка sentence панграммой (на английском) и возвращает истину если это так.
    Справка: панграмма - такое предложение, в котором каждая буква алфавита использована один раз
    Пример: The quick brown fox jumps over the lazy dog

    byte[] parseIp(String ip);

    Читает строку в которой записан IPv4 и возвращает массив из 4 значений типа byte со значениями этого айпи
    Для этого сначала нужно разделить строку на подстроки по КАКОМУ-ТО признаку (намек на то что вам нужно понять, по какому именно),
    а потом использовать класс Byte чтобы превратить строки в числа.
    Выбросить исключение, если на любом этапе работы метода была ошибка в введенных данных.
    Примеры айпи: 127.0.0.1, 192.168.0.12, 77.156.21.33
    Обратите внимание, что в результате могут выйти отрицательные числа.
    Это вполне нормально (см. тему "целочисленное переполнение")

    String encrypt(String text);

    Шифрует строку text таким образом, чтобы ее нельзя было с легкостью прочитать.
    Можно использовать любой метод шифрования, либо взять предложенный.

    Предложеный метод: метод Цезаря. Все буквы сдвигаются на 3 вперед по алфавиту для
    зашифровки и на 3 назад по алфавиту для расшифровки.
    Подсказка: табличка ASCII

    String decrypt(String data);

    Делает противоположное действие со строкой data к тому, которое было сделано в методе encrypt().
    Таким образом, происходит расшифровка, и должно быть получено исходное сообщение

    int countOccurencies(String text, char letter);

    Считает сколько раз символ letter появляется в строке text и возвращает это число.
    Возвращает 0 если переданная строка равна null, пуста, либо этого символа нет в строке.

    * boolean isEmail(String text);

    Проверяет, является ли строка text адресом электронной почты и возвращает истину, если это так.
    Для выполнения этого задания нужно будет использовать regex

    String reverse(String text);

    Разворачивает строку text. Например, строка Hello world должна быть превращена в dlrow olleH

    * String wordReverse(String text);

    Разворачивает порядок слов в строке text (слова разделены пробелами).
    Например, для ввода What a wonderful day результат будет day wonderful a What

    * String toCamelCase(String text);

    Переводит текст в строке text в идентификатор в стиле lowerCamelCase
    Например, для ввода What a BEAUTIFUL day должен получиться результат whatABeautifulDay

    Дополнительное задание: также убрать из строки все символы, которые не разрешаются
    в идентификаторах (напр. знаки препинания)
 */
import java.util.Scanner;

public class Main {

  public static int countOccurencies(String text, char letter) {
    if (text == null || text.isEmpty()) {
      return 0;
    }
    int count = 0;
    for (Character ch : text.toCharArray()) {
      if (ch == letter) {
        count++;
      }
    }
    return count;
  }

  //метод, принимающий строку text и возвращающий зашифрованную строку
  public static String encrypt(String text) {
    StringBuilder sb = new StringBuilder();//создаем обьект,который будет хранить строку
    // проходим по всей строке
    for (Character ch : text.toCharArray()) {
      sb.append((char) (ch + 3));//шифруем символ путем смещения вправо на три позиции
    }
    return sb.toString();//возвращаем полученную строку
  }

  //метод, принимающий строку data и возвращающий дешифрованную строку
  public static String decrypt(String data) {
    StringBuilder sb = new StringBuilder();//создаем обьект,который будет хранить дешифрованную строку
    // проходим по всей строке
    for (Character ch : data.toCharArray()) {
      sb.append((char) (ch - 3)); // делаем смещение на три позиции назад
    }
    return sb.toString();//возвращаем исходную строку
  }

  /*
   В методе isPalindrome использую массив символов для сравнения символов строки с обоих концов,
   проверяя является ли строка палиндромом, и возвращает соответсвующее булево значение.
   Преобразую строку "word" в массив символов и к нижнему регистру, чтобы игнорировать сам регистр
   букв в строке. Далее начинается цикл for, который итерирует от начала и до середины слова.
   Внутри цикла проверяется, не совпадают ли символы с обоих концов текущей пары.
   Если хотя бы одна пара символов не совпадает, возвращается false, указывая что строка
   не является палиндромом.
   */
  public static boolean isPalindrome(String word) {
    char[] charArr = word.toLowerCase().toCharArray();
    for (int i = 0; i < word.length() / 2; i++) {
      if (charArr[i] != charArr[word.length() - 1 - i]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPangram(String sentence) {
    for (char ch = 'a'; ch <= 'z'; ch++) {
      if (sentence.indexOf(ch) == -1) {
        return false;
      }
    }
    return true;
  }

  public static String reverse(String text) {
    StringBuilder sb = new StringBuilder(text);//создаем обьект,который будет принимать строку
    sb.reverse();//делаем разворот строки
    return sb.toString();//возвращаем полученную строку
  }

  public static String wordReverse(String text) {
    //разделяем строку text на подстроки, используя символ пробела в качестве разделителя
    // и сохраняем эти подстроки в массив
    String[] words = text.split("\\s+");
    StringBuilder sb = new StringBuilder(text);//создаем обьект,который будет принимать строку
    for (int i = words.length - 1; i >= 0; i--) { //итерация в обратном порядке
      sb.append(" ").append(words[i]);
    }
    return sb.toString(); //возвращаем полученную строку
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    System.out.println(countOccurencies(text, 'a'));
    System.out.println(encrypt(text));
    System.out.println(decrypt(encrypt(text)));
    String word = scanner.nextLine();
    System.out.println(isPalindrome(word));
    String sentence = scanner.nextLine();
    System.out.println(isPangram(sentence));
    System.out.println(reverse(text));
    System.out.println(wordReverse(text));
  }
}


