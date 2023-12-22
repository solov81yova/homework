package homework44.task01;

public class RegularPolygon extends Shape {

  protected int numberOfSides;
  protected double length;

  public RegularPolygon(int numberOfSides, double length) {
    super("RegularPolygon");
    this.numberOfSides = numberOfSides;
    this.length = length;
  }

  @Override
  public double getPerimeter() {
    return numberOfSides * length;
  }

  public int getNumberOfSides() {
    return numberOfSides;
  }

  public void setNumberOfSides(int numberOfSides) {
    this.numberOfSides = numberOfSides;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public String toString() {
    return "RegularPolygon{" +
        "numberOfSides=" + numberOfSides +
        ", length=" + length +
        '}';
  }
}
