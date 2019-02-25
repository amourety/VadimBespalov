/**
 * Created by amour on 10.04.2018.
 */
public class SimpleExecutorService {
    public void submitTask(Runnable runnable){
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
