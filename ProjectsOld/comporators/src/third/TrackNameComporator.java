package third;

import java.util.Comparator;

/**
 * Created by amour on 28.02.2017.
 */
public class TrackNameComporator implements Comparator<Track> {
    @Override
    public int compare(Track o1, Track o2) {
        return o1.getName().compareTo(o2.getName());
    }
}