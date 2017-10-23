package works;

public class Television {
    //singleton TV
    private Channel[] channels;
    private Channel runningChannel;
    private static final Television instance;
    private int count = 0;

    static {
        instance = new Television();
        }
    private Television(){
            channels = new Channel[10];
        }

    public static Television getInstance(){
            return instance;
        }

    public Channel[] getChannels() {
        return channels;
    }

    public Channel getChannelsFromIndex(int n){
            return channels[n];
    }
    public void addChannel(Channel channel){
            if (channels.length != count){
                channels[count] = channel;
                count++;
            }
        }
    public void printSetOfChannel(){
        int a = 1;
        for(Channel c: channels){
            System.out.print(a + ". ");
            System.out.println(c.getNameChannel());
            a++;
        }
        }
    public void run(){
        runningChannel = channels[0];
        System.out.println("SONY CONNECTING PEOPLES");
        Thread t = new Thread();
        t.start();
        for (int i = 500; i < 1000; i = i + 100){
            try{
                Thread.sleep(i);
            }catch(InterruptedException e){}
            System.out.println("Loading...");
        }
        }

    public void renamer(){
        for (Channel c: channels){
            int a = 1;
            for (Channel.Broadcast b: c.getBroadcasts()){
                b.setNameBroadcast(c.getNameChannel() + " " + a);
                a++;
            }
        }
    }

    public void setChannels(Channel[] channels) {
        this.channels = channels;
        }

    public Channel getRunningChannel() {
        return runningChannel;
        }

    public void setRunningChannel(Channel runningChannel) {
        this.runningChannel = runningChannel;
        }

    public int getCount() {
        return count;
        }

    public void setCount(int count) {
        this.count = count;
        }
}
