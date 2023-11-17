package homework29.task01;

public class Main {
  public static void printCanCrossTheRoad(TrafficLight trafficLight) {
    System.out.println("Can cross the road? " + trafficLight.canCrossTheRoad());

  }

  public static void main(String[] args) {
    TrafficLight trafficLight = new TrafficLight("green");
    printCanCrossTheRoad(trafficLight);
  }

}
