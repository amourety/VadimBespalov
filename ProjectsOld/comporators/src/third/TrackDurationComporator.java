package third;

import java.util.Comparator;

/**
 * Created by amour on 28.02.2017.
 */
public class TrackDurationComporator implements Comparator<Track>{

    @Override
    public int compare(Track o1, Track o2) {
        if(o1.getDuration() > o2.getDuration()){
            return 1;
        }
        if(o1.getDuration() < o2.getDuration()){
            return -1;
        }
        else {
            return 0;
        }
    }
}