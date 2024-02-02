package homework54.task01;

import java.util.ArrayList;
import java.util.Collections;
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
    return new LinkedList<>(songs);
  }

  public  Queue<String> getReverseListeningQueue() {
    List<Song> reversedSongs = new ArrayList<>();
    Collections.reverse(reversedSongs);
    return new LinkedList<>();
  }

  public Queue<String> getShuffledListeningQueue() {
    List<Song> shuffledSongs = new ArrayList<>();
    Collections.shuffle(shuffledSongs);
    return new LinkedList<>();
  }
}
