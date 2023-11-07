package homework25.task01;

public class Main {

  public static void main(String[] args) {
    Human anastasia = new Human();
    anastasia.name = "Anastasia";
    anastasia.age = "36";
    Human vadim = new Human();
    vadim.name = "Vadim";
    vadim.age = "19";
    Human marie = new Human();
    marie.name = "Marie";
    marie.age = "28";
    anastasia.introduce();
    vadim.introduce();
    marie.introduce();
  }

}
