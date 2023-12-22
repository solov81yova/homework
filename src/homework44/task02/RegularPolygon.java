package homework44.task02;

public class RegularPolygon extends Shape implements Resizable{
  private double numberOfSides;
  private double length;

  public RegularPolygon(double numberOfSides, double length) {
    super("RegularPolygon");
    this.numberOfSides = numberOfSides;
    this.length = length;
  }

  @Override
  public double getPerimeter() {
    return numberOfSides * length;
  }

  public double getNumberOfSides() {
    return numberOfSides;
  }

  public void setNumberOfSides(double numberOfSides) {
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

  @Override
  public void resize(double coefficient) {
    numberOfSides *= coefficient;
    length *= coefficient;
  }
}
