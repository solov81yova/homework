package homework39.task02;

public class Manager extends Employee {

  public Manager(String name, double salary) {
    super(name, salary, "Manager");
  }

  @Override
  public void makeWork() {
    System.out.println("Manager: " + getName() + ", " + getSalary() + ": You should work harder!");
  }

  }

