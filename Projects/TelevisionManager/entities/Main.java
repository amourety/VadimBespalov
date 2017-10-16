package entities;

import entities.Channel;
import entities.Controler;
import entities.Television;

public class Main {

    public static void main(String[] args) {
        Television tele = Television.getInstance();
        Controler controler = Controler.builder().setTelevision(tele).build();
        Channel.Broadcast[] set1 = {new Channel.Broadcast("1",6,10), new Channel.Broadcast("2",10,12), new Channel.Broadcast("3", 12, 16), new Channel.Broadcast("4", 16, 24)};
        tele.addChannel(new Channel("TNT", set1));
        tele.addChannel(new Channel("ERT", set1));
        tele.addChannel(new Channel("TV 3", set1));
        tele.addChannel(new Channel("CTC", set1));
        tele.addChannel(new Channel("MUYO", set1));
        tele.addChannel(new Channel("1 CHANNEL", set1));
        tele.addChannel(new Channel("JOJO", set1));
        tele.addChannel(new Channel("ECK", set1));
        tele.addChannel(new Channel("DOZHD", set1));
        tele.addChannel(new Channel("E32", set1));
        controler.changeChannel("E32");
    }
}
