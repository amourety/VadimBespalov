package entities;


import java.time.LocalTime;

public class Broadcast {
    private LocalTime startingTime;
    private LocalTime endingTime;
    private String nameBroadcast = "DEFAULT_BROADCAST";
    public Broadcast(String broadcastName, int timeBegin, int timeFinish){
        setNameBroadcast(broadcastName);
        setStartingTime(timeBegin);
        setEndingTime(timeFinish);
    }

    public LocalTime getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(int time) {
        this.startingTime = LocalTime.of((time / 3600) % 24, (time % 3600) / 60, time % 60);
    }

    public LocalTime getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(int time) {
        this.endingTime = LocalTime.of((time / 3600) % 24, (time % 3600) / 60, time % 60);
    }

    public String getNameBroadcast() {
        return nameBroadcast;
    }

    public void setNameBroadcast(String nameBroadcast) {
        this.nameBroadcast = nameBroadcast;
    }

}
