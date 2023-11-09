package homework25.task02;


public class Pen {

  int inkQuantity;

  public void write(String text) {
    int inkUsed = text.length();
    inkQuantity -= inkUsed;
    System.out.println("В ручке осталось " + inkUsed + " чернил");

    if (inkUsed <= 0) {
      System.out.println("Чернила закончились!");
    }

  }

  public void refillInk() {
    System.out.println("Количество чернил в ручке снова " + inkQuantity);

  }

  public int checkInkQuantity() {
    System.out.println("В ручке осталось " + inkQuantity + " чернил");
    return inkQuantity;
  }
}
