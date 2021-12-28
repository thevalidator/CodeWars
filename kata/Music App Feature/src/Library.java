import java.util.*;
import java.util.stream.Collectors;


public class Library {

    private List<Song> songList;

    public Library(){
        songList = new ArrayList<>();
    }

    public void addSong(Song s){
        songList.add(s);
    }

    public void removeSong(Song s){
        songList.remove(s);
    }

    public List<Song> getSongList(){
        return songList;
    }

    //TODO: start coding here, DO NOT MODIFY CODE
    public String getLibraryChart(){
        Comparator<Song> byPlays = Comparator.comparing(
                Song::getTimesThatRepated
        ).reversed();

        Comparator<Song> byName = Comparator.comparing(
                Song::getTitle
        ).thenComparing(Song::getAuthor).reversed();
        StringBuilder sb = new StringBuilder();
        getSongList().stream().sorted(byPlays.thenComparing(byName)).collect(Collectors.toList()).forEach(sb::append);

        return sb.toString();
    }


}
class Song{
    /**
     * adminitrates a Song
     */
    private String title;
    private String author;
    private int duration;
    private int timesThatRepated;

    public Song(String t, String a, int d){
        title = t;
        author = a;
        duration = d;
        timesThatRepated = 0;
    }

    public int getTimesThatRepated() {
        return timesThatRepated;
    }

    public void setTimesThatRepated(int timesThatRepated) {
        this.timesThatRepated = timesThatRepated;
    }

    public String getAuthor() {
        return author;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public String toString(){
        return String.format("[title:%s, author:%s, duration:%s] Plays -> %s",
                title,author,duration,timesThatRepated);
    }

}

