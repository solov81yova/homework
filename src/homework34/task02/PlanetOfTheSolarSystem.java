package homework34.task02;

public enum PlanetOfTheSolarSystem {
  EARTH("Earth"),
  MERCURY("Mercury"),
  VENUS("Venus"),
  MARS("Mars"),
  JUPITER("Jupiter"),
  SATURN("Saturn"),
  URANUS("Uranus"),
  NEPTUNE("Neptune");
  private final String name;
  PlanetOfTheSolarSystem(String name) {
    this.name = name;
  }
  public  String getName() {
    return name;
  }
}
