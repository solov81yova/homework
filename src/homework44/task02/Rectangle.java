package homework44.task02;

public class Rectangle extends Shape implements Resizable{

  protected double length;
  protected double width;

  public Rectangle(double length, double width) {
    super("Rectangle");
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

  @Override
  public void resize(double coefficient) {
    length *= coefficient;
    width *= coefficient;
  }
}
