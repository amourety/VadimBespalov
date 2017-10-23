package works;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    final static String CASE_PRINT_CHANNELS = "PRINT CHANNELS";
    final static String CASE_PRINT = "PRINT BROADCASTS";
    final static String CASE_CHANGE = "CHANGE CHANNEL";
    final static String CASE_INFO = "INFO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Television tele = Television.getInstance();
        Controler controler = Controler.builder().setTelevision(tele).build();
        Channel.Broadcast[] set1 = {new Channel.Broadcast(LocalTime.of(0, 1), LocalTime.of(23, 59), "1"),
                new Channel.Broadcast(LocalTime.of(12, 15), LocalTime.of(15, 0), "2"),
                new Channel.Broadcast(LocalTime.of(9, 15), LocalTime.of(9, 50), "3"),
                new Channel.Broadcast(LocalTime.of(10, 55), LocalTime.of(12, 0), "4")};
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
        tele.run();
        tele.renamer();
        tele.printSetOfChannel();
        StringBuilder SB = new StringBuilder().append("COMMAND INFO \n")
                .append("1. PRINT CHANNELS \n").append("2. PRINT BROADCASTS \n"). append("3. CHANGE CHANNEL \n").append("4. EXIT \n").append("5. INFO");
        System.out.println(SB.toString());
        while (true) {
            String command = sc.nextLine();
            switch (command){
                case CASE_CHANGE:
                    System.out.println("Enter a name of channel");
                    controler.switchChannel(sc.nextLine());
                    break;

                case CASE_PRINT:
                    System.out.println("Enter number of channel to see broadcasts");
                    tele.getChannelsFromIndex(sc.nextInt()).printBroadcasts();
                    break;

                case CASE_PRINT_CHANNELS:
                    tele.printSetOfChannel();
                    break;

                case CASE_INFO:
                    System.out.println(SB.toString());
                    break;

                case "EXIT":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter INFO");
                    System.out.println("RUNNING " + tele.getRunningChannel().getNameChannel());
                    break;
            }
        }
    }
}
