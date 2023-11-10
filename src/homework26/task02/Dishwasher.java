package homework26.task02;

public class Dishwasher {
  String model;
  String dimensions; // in cm width * height
  int capacity; // number of cookware
  char energyClass; // from A to G, A+, A++
  char washClass; // from A to E
  String dryingClass; // intensive drying, turbo drying, condensation

  // конструктор с параметрами
  public Dishwasher(String model, String dimensions, int capacity, char energyClass,
      char washClass, String dryingClass) {
    this.model = model;
    this.dimensions = dimensions;
    this.capacity = capacity;
    this.energyClass = energyClass;
    this.washClass = washClass;
    this.dryingClass = dryingClass;
  }
  // конструктор по умолчанию
  public Dishwasher() {
    this ("Siemens", "45 * 80", 10, 'A', 'B',
        "turbo drying");
  }

}
