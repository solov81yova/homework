package homework35;

public class LightBulb {

  private long barcode;// заменила String на long и заменила в слове Сode первую букву на маленькую
  private String manufacturer;
  private int brightness; //можно также использовать тип float или double
  private int power;

  private String rgb;// заменила boolean на String, чтобы обозначать цвет лампочки
  private double price;

  public LightBulb(long barcode, String manufacturer, int brightness, int power, String rgb,
      double price) {
    this.barcode = barcode;
    this.manufacturer = manufacturer;
    this.brightness = brightness;
    this.power = power;
    this.rgb = rgb;
    this.price = price;
  }

  public long getBarcode() {
    return barcode;
  }

  public void setBarсode(long barcode) {
    this.barcode = barcode;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getBrightness() {
    return brightness;
  }

  public int getPower() {
    return power;
  }

  public String getRgb() { //заменила тип переменной и добавила get вместо is
    return rgb;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}



