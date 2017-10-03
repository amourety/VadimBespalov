package third;

import java.util.Comparator;

/**
 * Created by amour on 28.02.2017.
 */
public class AuthorNameComporator implements Comparator<Track> {

    @Override
    public int compare(Track o1, Track o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
