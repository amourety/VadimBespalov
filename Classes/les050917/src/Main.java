/**
 * Created by amour on 05.09.2017.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread t = new Thread();
        t.run();
        System.out.println("Введите имя того, кого хотите проверить");
        String name = sc.nextLine();
        System.out.println("Введите сколько нужно его проверить");
        double count = sc.nextDouble();
        double pedikkoef = 0;
        Randomizer r1 = new Randomizer();
        for (int i = 0; i < count; i++) {
            try {
                int x = r1.random(3);
                t.sleep(1500);
                pedikkoef = cheking(x, name, pedikkoef);
            } catch (InterruptedException ex) {
                t.currentThread().interrupt();
            }
        }
            System.out.println("ALERT!!!HOMOSEXUAL AZH NA " + (int)((pedikkoef/count)*100) + "%");
    }

    public static double cheking(int x, String username, double pedikkoef) {
        if (x % 2 == 1) {
            System.out.println(username + " - NATURAL");
            return pedikkoef;
        } else {
            System.out.println(username + " - HOMOSEXUAL");
            return pedikkoef+1;
        }
    }
}


