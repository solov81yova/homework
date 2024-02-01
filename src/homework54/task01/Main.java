package homework54.task01;
/*
Разработать класс Песня.
Определить поля название, имя исполнителя и длительность.
Переопределить toString таким образом, чтобы он выводил песню в таком формате:
<исполнитель> - <название> (<длительность>)
Естественно, что длительность нужно сохранить в секундах, а выводить в минутах и секундах.

Создать класс Плейлист. В нем создать поле песни (коллекция), которое будет хранить песни, сохраненные в этот плейлист.
Определить методы для доступа к отдельным песням, а так же методы для добавления и удаления песен.

Определить такие методы:
- getListeningQueue - вернет очередь из всех песен плейлиста в том порядке, в котором они добавлены.
- getReverseListeningQueue - вернет очередь всех песен в обратном порядке.
- getShuffledListeningQueue - вернет очередь из всех песен в случайном порядке.
Обратите внимание, что ни один из этих методов не должен изменять порядок песен в самом плейлисте.

В методе main создать плейлист песен и метод "послушать плейлист", который получит плейлист, из него возьмет очередь
песен, и выведет каждую песню в таком формате:
Играет песня: <песня>
Для этого вывода использовать toString в классе песни.
 */
import java.util.Queue;

public class Main {

  public static void listenToPlaylist(Playlist playlist) {
    Queue<String> listeningQueue = playlist.getListeningQueue();
    while (!listeningQueue.isEmpty()) {
      System.out.println("Playing song: " + listeningQueue.poll());
    }
  }

  public static void main(String[] args) {
    Playlist playlist = new Playlist();
    Song song1 = new Song("A pack of cigarettes", "Victor Tsoy", 180);
    Song song2 = new Song("Summer will end", "Victor Tsoy", 200);
    Song song3 = new Song("Blood type", "Victor Tsoy", 210);
    playlist.addSong(song1.toString());
    playlist.addSong(song2.toString());
    playlist.addSong(song3.toString());
    listenToPlaylist(playlist);
  }
}
