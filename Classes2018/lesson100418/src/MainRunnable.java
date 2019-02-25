/**
 * Created by amour on 10.04.2018.
 */
public class MainRunnable {
    public static void main(String[] args) {
        Thread marselThread = new Thread(new MarselNameRunnable());
        Thread guzelThread = new Thread(new GuzelNameRunnable());
        marselThread.start();
        guzelThread.start();

    }
}
