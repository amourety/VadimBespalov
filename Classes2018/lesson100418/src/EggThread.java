/**
 * Created by amour on 10.04.2018.
 */
public class EggThread extends Thread {
    public EggThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 0; i < 10000; i++){
            System.out.println("Thread" + Thread.currentThread().getName() + " is Egg");
        }
    }
}
