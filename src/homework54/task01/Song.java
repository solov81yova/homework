package homework54.task01;

public class Song {
private String title;
private String name;
private int duration;

  public Song(String title, String name, int duration) {
    this.title = title;
    this.name = name;
    this.duration = duration;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  @Override
  public String toString() {
    return "Song{" +
        "name='" + name  + '\'' +
        " - title='" + title  + '\'' +
        " duration= " + "(" + (duration / 60) + ":" + (duration % 60) +")" +
        '}';
  }
}
