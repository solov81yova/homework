package homework39.task02;

public class Employee {
  private String name;
  private double salary;
  private final String position;

  public Employee(String name, double salary, String position) {
    this.name = name;
    this.salary = salary;
    this.position = position;
  }
public void makeWork() {
  System.out.println(name + " makes some kind of job");
}
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getPosition() {
    return position;
  }

  @Override
  public String toString() {
    return super.toString() + ", "
        + "Name: " + this.name + ", "
        + "Salary: " + this.salary + ", "
        + "Position: " + this.position;
  }
}
