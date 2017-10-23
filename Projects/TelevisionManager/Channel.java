package works;

import java.time.LocalTime;


public class Channel {
    private String nameChannel;
    private Broadcast[] broadcasts;
    private final int COUNT = 4;
    public Channel(String nameChannel, Broadcast[] set){
        broadcasts = set;
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
        public Broadcast(LocalTime startTime, LocalTime endTime, String broadcastName){
            setNameBroadcast(broadcastName);
            this.startingTime = startTime;
            this.endingTime = endTime;
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

    public void printBroadcasts() {
        for (Channel.Broadcast s : this.getBroadcasts()) {
            System.out.println(s.getStartingTime().getHour() + ":" + (s.getStartingTime().getMinute() < 10 && s.getStartingTime().getMinute() >= 0 ? ("0" + s.getStartingTime().getMinute()) : s.getStartingTime().getMinute()) + " " + s.getNameBroadcast());
        }
        System.out.println();
    }
}

