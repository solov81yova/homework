package homework37.task01;

public class RemoteControl {
  private int frequency;

  public RemoteControl(int frequency) {
    this.frequency = frequency;
  }

  public int getFrequency() {
    return frequency;
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }
  // метод переключения каналов вперед
  public void switchForward(Television tv) {
    if (this.frequency == tv.getFrequency()) {

      int currentChannel = tv.getCurrentChannel();
      if (currentChannel >= 1) {
        tv.setCurrentChannel(currentChannel + 1);
        System.out.println("The channel switched on: " + tv.getCurrentChannel());
      } else {
        System.out.println("You are at the channel number one");
      }
    }
  }
  //метод переключения каналов назад
  public void switchBackward(Television tv) {
    if (this.frequency == tv.getFrequency()) {
      int currentChannel = tv.getCurrentChannel();
      if (currentChannel > 1) {
        tv.setCurrentChannel(currentChannel - 1);
        System.out.println("The channel switched on: " + tv.getCurrentChannel());
      } else {
        System.out.println("You are at the channel number one");
      }
    }
  }
  // метод переключения каналов произвольно
  public void switchChannel(Television tv, int channel) {
    if (this.frequency == tv.getFrequency()) {
      tv.setCurrentChannel(channel);
      System.out.println("The channel switched on: " + channel + " channel");
    } else {
      System.out.println("Frequency interference");
    }
  }
}
