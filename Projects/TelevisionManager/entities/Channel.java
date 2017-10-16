package entities;

import java.time.LocalTime;


public class Channel {
    private String nameChannel;
    private Broadcast[] broadcasts;
    private final int COUNT = 4;
    public Channel(int n, String nameChannel){
        broadcasts = new Broadcast[COUNT];
        this.nameChannel = nameChannel;
    }
    public Channel(String nameChannel, Broadcast[] set){
        broadcasts = new Broadcast[COUNT];
        broadcasts = set;

        for (int i = 0; i < COUNT; i++){
            broadcasts[i].setNameBroadcast("BROADCAST #" + COUNT);
        }
        this.nameChannel = nameChannel;
    }
    public String getNameChannel() {
        return nameChannel;
    }

    public void setNameChannel(String nameChannel) {
        this.nameChannel = nameChannel;
    }

    public Broadcast[] getBroadcasts() {
        return broadcasts;
    }

    public void setBroadcasts(Broadcast[] broadcasts) {
        this.broadcasts = broadcasts;
    }



    static class Broadcast {
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

}

