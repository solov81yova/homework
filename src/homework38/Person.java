package homework38;

public class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }
public void introduce(Person person) {
  System.out.println("Hello! My name is: " + person.getName());
}
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

