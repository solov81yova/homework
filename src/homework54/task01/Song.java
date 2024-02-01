package homework54.task01;

public class Song {
private String title;
private String singer;
private int duration;

  public Song(String title, String singer, int duration) {
    this.title = title;
    this.singer = singer;
    this.duration = duration;
  }


  @Override
  public String toString() {
    return "Song{" +
        "<singer='" + singer + ">" + '\'' +
        "- <title='" + title + ">"  + '\'' +
        "(<duration= " + (duration / 60) + " m " + (duration % 60) + " s" + ">)" +
        '}';
  }
}
