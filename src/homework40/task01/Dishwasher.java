package homework40.task01;

import java.util.Objects;

public class Dishwasher {

  private String model;
  private int width;// in cm
  private int height;// in cm
  private int capacity;// number of cookware
  private char energyClass;// from A to G
  private char washClass;// from A to E
  private String dryingClass;// intensive drying, turbo drying, condensation

  // конструктор с параметрами
  public Dishwasher(String model, int width, int height, int capacity, char energyClass,
      char washClass, String dryingClass) {
    this.model = model;
    this.width = width;
    this.height = height;
    this.capacity = capacity;
    this.energyClass = energyClass;
    this.washClass = washClass;
    this.dryingClass = dryingClass;
  }

  //конструктор по умолчанию
  public Dishwasher() {
    this("", 0, 0, 0, ' ', ' ', "");
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public char getEnergyClass() {
    return energyClass;
  }

  public void setEnergyClass(char energyClass) {
    this.energyClass = energyClass;
  }

  public char getWashClass() {
    return washClass;
  }

  public void setWashClass(char washClass) {
    this.washClass = washClass;
  }

  public String getDryingClass() {
    return dryingClass;
  }

  public void setDryingClass(String dryingClass) {
    this.dryingClass = dryingClass;
  }

  @Override
  public String toString() {
    return super.toString() + ", "
        + "Model: " + this.model + ", "
        + "Width: " + this.width + ", "
        + "Height: " + this.height + ", "
        + "Capacity: " + this.capacity + ", "
        + "Class energy : " + this.energyClass + ", "
        + "Class washing : " + this.washClass + ", "
        + "Class drying : " + this.dryingClass;
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, width, height, capacity, energyClass, washClass, dryingClass);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    Dishwasher dishwasher;
    if (obj instanceof Dishwasher) {
      dishwasher = (Dishwasher) obj;
    } else {
      return false;
    }
    return this.model.equals(dishwasher.model)
        && this.width == dishwasher.width
        && this.height == dishwasher.height
        && this.capacity == dishwasher.capacity
        && this.energyClass == dishwasher.energyClass
        && this.washClass == dishwasher.washClass
        && this.dryingClass.equals(dishwasher.dryingClass);
  }
}

