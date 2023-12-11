package homework39.task02;

public class Developer extends Employee {

  public Developer(String name, double salary) {
    super(name, salary, "Developer");
  }
  @Override
  public void makeWork() {
    System.out.println("Developer: " + getName() + ", " + getSalary() + ": I am working hard with a software!");
  }
}
