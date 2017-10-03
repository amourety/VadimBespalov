package second;

/**
 * Created by amour on 01.03.2017.
 */
public class Track implements Comparable<Track>{
    private String name;
    private int duration;
    private String author;

    public void Track(String name, int duration, String author){
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int compareTo(Track o) {
        return name.compareTo(o.getName());
    }
}
