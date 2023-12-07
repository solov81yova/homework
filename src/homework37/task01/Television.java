package homework37.task01;

public class Television {
  private int frequency;//in Hz свойство частота
  private int currentChannel;// свойство текущий канал

  public Television(int frequency, int currentChannel) {
    this.frequency = frequency;
    this.currentChannel = currentChannel;
  }

  public int getFrequency() {
    return frequency;
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  public int getCurrentChannel() {
    return currentChannel;
  }

  public void setCurrentChannel(int currentChannel) {
    this.currentChannel = currentChannel;
  }
}
