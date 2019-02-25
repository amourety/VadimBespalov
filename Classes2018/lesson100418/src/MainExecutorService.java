/**
 * Created by amour on 10.04.2018.
 */
public class MainExecutorService {
    public static void main(String[] args) {
        SimpleExecutorService simpleExecutorService = new SimpleExecutorService();
        simpleExecutorService.submitTask(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("Marsel");
            }
        });
        simpleExecutorService.submitTask(() ->{
            for (int i = 0; i < 10000; i++) {
                System.out.println("Guzel");
            }
        });
    }
}
