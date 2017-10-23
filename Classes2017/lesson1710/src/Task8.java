
import java.util.Scanner;

/**
 * Created by amour on 23.10.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        double D = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        if (r1 + r2 > D) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}