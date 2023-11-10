package homework26.task02;

public class Dishwasher {
  String model;
  int width;  // in cm
  int height; // in cm
  int capacity; // number of cookware
  char energyClass; // from A to G
  char washClass; // from A to E
  String dryingClass; // intensive drying, turbo drying, condensation

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
  // конструктор по умолчанию
  public Dishwasher() {
    this ("Siemens", 45, 80, 10, 'A', 'B',
        "turbo drying");
  }

}
