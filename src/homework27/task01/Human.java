package homework27.task01;

public class Human {

  private String name;
  private int  age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;

  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public void setName(String name) {
    if (name.isEmpty()) {
      return;
    }
    this.name = name;
  }
  public void setAge(int age) {
    if (age > 30) {
      this.age = 30;
      System.out.println("you are still very young");
    } else {
      this.age = age;
    }
  }
}
