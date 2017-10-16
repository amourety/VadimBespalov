package entities;

public class Channel {
    private String nameChannel;
    private Broadcast[] broadcasts;
    private final int COUNT = 4;
    public Channel(int n, String nameChannel){
        broadcasts = new Broadcast[COUNT];
        this.nameChannel = nameChannel;
    }
    public Channel(String nameChannel){
        broadcasts = new Broadcast[COUNT];
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

}

