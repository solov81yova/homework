package homework44.task01;

public class Rectangle extends Shape {

  protected double length;
  protected double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double getPerimeter() {
    return 2 * (length + width);
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "length=" + length +
        ",  width=" + width +
        '}';
  }
}

