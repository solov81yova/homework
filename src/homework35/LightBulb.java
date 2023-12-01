package homework35;

public class LightBulb {

  private long barcode;// заменила String на long и заменила в слове Сode первую букву на маленькую
  private String manufacturer;
  private int brightness; //можно также использовать тип float или double
  private String rgb;// заменила boolean на String, чтобы обозначать цвет лампочки
  private double price;

  public LightBulb(long barcode, String manufacturer, int brightness, String rgb, double price) {
    this.barcode = barcode;
    this.manufacturer = manufacturer;
    this.brightness = brightness;
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
// это поле не задавалось изначально , потому и геттер не нужен
  /*
  public int getPower() {
    return power;
  }
*/

