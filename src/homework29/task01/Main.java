package homework29.task01;


import homework29.TrafficLightColor;

public class Main {
  public static void printCanCrossTheRoad(TrafficLight trafficLight) {
    System.out.println("The current color now is: " + trafficLight.getCurrentColor());
    System.out.println("Can cross the road? " + trafficLight.canCrossTheRoad());

  }

  public static void main(String[] args) {
    TrafficLight trafficLight = new TrafficLight();
    printCanCrossTheRoad(trafficLight);
  }

}
