/**
 * Created by amour on 10.04.2018.
 */
public class MainEggChickenThread {
    public static void main(String[] args) throws InterruptedException {
        EggThread eggThread = new EggThread("EggThread");
        ChickenThread chickenThread = new ChickenThread("ChickenThread");
        chickenThread.start();
        eggThread.start();
        eggThread.join();
        chickenThread.join();


        for(int i = 0; i < 100; i++){
            System.out.println("Thread" + Thread.currentThread().getName() + " я батя");
        }
    }
}
