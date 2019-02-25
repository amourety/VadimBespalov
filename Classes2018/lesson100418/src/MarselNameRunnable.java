/**
 * Created by amour on 10.04.2018.
 */
public class MarselNameRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 100;i++){
            System.out.println("Marsel");
        }
    }
}
