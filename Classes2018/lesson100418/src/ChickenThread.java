/**
 * Created by amour on 10.04.2018.
 */
public class ChickenThread extends Thread {
    public ChickenThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 0; i < 10000; i++){
            System.out.println("Thread" + Thread.currentThread().getName() + " is Chicken");
        }
    }
}
