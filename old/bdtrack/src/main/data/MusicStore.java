package main.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import main.entities.Track;
import main.comporators.TrackAuthorComporator;
import main.comporators.TrackDurComporator;
import main.comporators.TrackNameComporator;

/**
 * Created by amour on 07.03.2017.
 */
public class MusicStore implements Store {
    private ArrayList<Track> trackList = new ArrayList<>();

    public String printStorage(){
        return Arrays.toString(trackList.toArray());
    }

    public void addTrack(String s, String a, int d, String g) {
        trackList.add(new Track(s, a, d, g));
    }

    public void removeByAuthorAndName(String a, String name) throws ExeptionSearch {
        Iterator<Track> iterator = trackList.iterator();
        Track t;
        boolean search = false;
        while (iterator.hasNext()){
            t = iterator.next();
            if (t.getName().equals(name) && t.getAuthor().equals(a)){
                iterator.remove();
                search = true;
            }
        }
        if (!search) {
            throw new ExeptionSearch("Такого трека нет");
        }
    }

    public ArrayList<Track> searchByTrackName(String a) throws ExeptionSearch{
        Iterator<Track> iterator = trackList.iterator();
        ArrayList<Track> list = new ArrayList<>();
        Track t;
        boolean search = false;
        while (iterator.hasNext()){
            t = iterator.next();
            if (t.getName().equals(a) || t.getAuthor().equals(a)){
                list.add(t);
                search = true;
            }
        }
        if (!search) {
            throw new ExeptionSearch("Нет таких треков");
        }
        return list;
    }

    public ArrayList<Track> searchByDuration(String s, int a) throws ExeptionSearch {
        ArrayList<Track> list = new ArrayList<>();
        Iterator<Track> iterator = trackList.iterator();
        boolean search = false;
        Track t;
        switch (s) {
            case ">=":
                while (iterator.hasNext()) {
                    t = iterator.next();
                    if (t.getDur() >= a){
                        list.add(t);
                        search = true;
                    }
                }
                break;
            case "<=":
                while (iterator.hasNext()) {
                    t = iterator.next();
                    if (t.getDur() <= a){
                        list.add(t);
                        search = true;
                    }
                }
                break;
        }
        if (!search) {
            throw new ExeptionSearch("Нет таких треков");
        }
        return list;
    }
    public void sort(String type) throws ExeptionSearch{
        boolean search = false;
        switch(type) {
            case "Name":
                trackList.sort(new TrackNameComporator());
                break;
            case "Author":
                trackList.sort(new TrackAuthorComporator());
                break;
            case "Duration":
                trackList.sort(new TrackDurComporator());
                break;
        }
            if (!type.contains("Name") && !type.contains("Author") && !type.contains("Duration")) {
                throw new ExeptionSearch("Введите корреткный тип, по которому совершить сортировку");
            }
        System.out.println(Arrays.toString(trackList.toArray()));
    }
}

