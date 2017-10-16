package entities;

public class Television {
    //singleton TV
        private Channel[] channels;
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

}