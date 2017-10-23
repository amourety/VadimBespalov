import java.util.Scanner;

/**
 * Created by amour on 23.10.2017.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a != 0) {
            int d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println(x1);
                System.out.println(x2);
            } else if (d == 0) {
                double x = (-b) / (2 * a);
                System.out.println(x);
            }
            else
            {
                System.out.println("-1");
            }

        }
    }
}
