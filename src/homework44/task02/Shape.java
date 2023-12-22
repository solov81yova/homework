package homework44.task02;

public class Shape implements Resizable {
private String name;

  public Shape(String name) {
    this.name = name;
  }
  public double getPerimeter(){
    return 0;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void resize(double coefficient) {

  }
}
