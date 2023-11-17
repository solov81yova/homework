package homework29;

public enum TrafficLightColor {
  RED ("red"),
  YELLOW("yellow"),
  GREEN("green");

  // названия цветов светофора
  private final String trafficColor;
  //констрктор
  private TrafficLightColor(String trafficColor) {
    this.trafficColor = trafficColor;
  }
  //геттер
  public String getTrafficColor() {
    return trafficColor;
  }
}
