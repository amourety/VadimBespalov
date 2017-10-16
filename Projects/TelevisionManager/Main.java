import entities.Channel;
import entities.Controler;
import entities.Television;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Television tele = Television.getInstance();
        Controler controler = Controler.builder().build();
        tele.addChannel(new Channel("TNT"));
        tele.addChannel(new Channel("ERT"));
        tele.addChannel(new Channel("TV 3"));
        tele.addChannel(new Channel("CTC"));
        tele.addChannel(new Channel("MUYO"));
        tele.addChannel(new Channel("1 CHANNEL"));
        tele.addChannel(new Channel("JOJO"));
        tele.addChannel(new Channel("ECK"));
        tele.addChannel(new Channel("DOZHD"));
        tele.addChannel(new Channel("E32"));
        controler.changeChannel("DOZHD");
    }
}
