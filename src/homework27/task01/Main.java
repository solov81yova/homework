package homework27.task01;


public class Main {


  public static void main(String[] args) {
    Human human = new Human("Anastasia", 36);
    System.out.println(
        "Hello, my name is " + human.getName() + "," + " im " + human.getAge() + "!");
    System.out.println("Time to introduce for the second person!");
    human.setName("Vadim");
    human.setAge(19);
    System.out.println(
        "Hello, my name is " + human.getName() + "," + " im " + human.getAge() + "!");
    System.out.println("Time to introduce for the third person!");
    human.setName("Marie");
    human.setAge(28);
    System.out.println(
        "Hello, my name is " + human.getName() + "," + " im " + human.getAge() + "!");

  }

}


