package main.data;
import main.entities.Track;
import java.util.ArrayList;
/**
 * Created by amour on 15.03.2017.
 */
public interface Store {
    public void addTrack(String s, String a, int d, String g);
    public void removeByAuthorAndName(String a, String name) throws ExeptionSearch;
    public ArrayList<Track> searchByTrackName(String a) throws ExeptionSearch;
    public ArrayList<Track> searchByDuration(String s, int a) throws ExeptionSearch;
    public void sort(String type) throws ExeptionSearch;
    public String printStorage();
}
