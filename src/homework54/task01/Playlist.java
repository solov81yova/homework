package homework54.task01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Playlist {
private List<String> songs;

  public Playlist() {
    songs = new ArrayList<>();
  }
  //добавление песни в плейлист
  public void addSong(String song) {
    songs.add(song);
  }
  //удаление песни из плейлиста
  public void removeSong(String song) {
    songs.remove(song);
  }
  // поиск отдельной песни по индексу
  public String getSong(int index) {
    if (index >= 0 && index < songs.size()) {
      return songs.get(index);
    }
    return null;
  }
  public Queue<String> getListeningQueue() {
    return new  LinkedList<>(songs);
  }
  public Queue<String> getReverseListeningQueue() {
    ArrayList<String> reversedSongs = new ArrayList<>(songs);
    return new LinkedList<>(reversedSongs);
  }
  public Queue<String> getShuffledListeningQueue() {
    ArrayList<String> shuffledSongs = new ArrayList<>(songs);
    return new LinkedList<>(shuffledSongs);
  }
}
