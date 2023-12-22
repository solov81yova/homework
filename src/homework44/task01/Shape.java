package homework44.task01;

public abstract class Shape {

  protected String name;

  public Shape(String name) {
    this.name = name;
  }

  public abstract double getPerimeter();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
