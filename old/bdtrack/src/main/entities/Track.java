package main.entities;

/**
 * Created by amour on 07.03.2017.
 */
public class Track {
    private String name;
    private int dur; //в секундах
    private String genre;
    private String author;

    public Track(String name, String author, int dur, String genre) {
        this.name = name;
        this.dur = dur;
        this.genre = genre;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getDur() {
        return dur;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString(){
        return "Название -" + getName() + " Длительность:" + getDur() + " Исполнитель: " + getAuthor() + " Жанр: " + getGenre();
    }
}
