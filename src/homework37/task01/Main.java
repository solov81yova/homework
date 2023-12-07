package homework37.task01;
/*
Создать два класса - пульт и телевизор.
В обоих классах описать свойство "частота" (frequency).
В телевизоре описать свойство "текущий канал".
Описать в обоих классах конструкторы и аксесоры.
В пульте сделать методы чтобы:
1 Переключить канал вперед;
2 Переключить канал назад;
3 Переключить канал произвольно (передать номер канала).
Все методы должны принимать телевизор как параметр. Последний метод также должен принимать номер канала.
Учтите, что каналы не должны быть отрицательными.
Переключение канала должно происходить только в том случае, если частота пульта и телевизора совпадают.
Если введенный в третьем методе канал имеет неправильный номер, не делать ничего.

Продемонстрировать работу разработанных классов в свободной в классе Main.
В комментарии к main указать, какое это отношение (композиция, ассоциация или агрегация).
 */

public class Main {
/*
Вызов метода переключения каналов класса Пульт в классе Main является отношением
ассоциации между этими классами
 */
  public static void main(String[] args) {
    Television tv = new Television(100, 1);
    System.out.println("The current frequency is: " + tv.getFrequency());
    RemoteControl remote = new RemoteControl(tv.getFrequency());
    System.out.println("You can change the channel forward " + tv.getCurrentChannel());
    remote.switchForward(tv);
    remote.switchForward(tv);
    System.out.println("You can change the channel backward " + tv.getCurrentChannel());
    remote.switchBackward(tv);
    remote.switchBackward(tv);
    remote.switchBackward(tv);
    remote.switchChannel(tv, tv.getCurrentChannel());
  }
}
