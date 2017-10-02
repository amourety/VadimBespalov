package main.comporators;

import main.entities.Track;

import java.util.Comparator;

/**
 * Created by amour on 15.03.2017.
 */
public class TrackDurComporator implements Comparator<Track> {
    public int compare(Track o1, Track o2){
        return o1.getDur() - o2.getDur();
    }
}
