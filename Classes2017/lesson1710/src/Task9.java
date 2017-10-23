import java.util.Scanner;

/**
 * Created by amour on 23.10.2017.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("0");
        } else {
            if (a != 0) {
                if (a == 1) {
                    System.out.print("x^2");
                } else if (a == -1) {
                    System.out.print("-x^2");
                } else {
                    System.out.print(a + "x^2");
                }

                if (b != 0) {
                    System.out.print((b > 0 ? " + " : " - "));
                } else if (c != 0) {
                    System.out.print((c > 0 ? " + " : " - "));

                }
            }

            if (b != 0) {
                if (b == 1 || b == -1) {
                    System.out.print("x");
                } else {
                    System.out.print((Math.abs(b) + "x"));
                }

                if (c != 0) {
                    System.out.print((c > 0 ? " + " : " - "));
                }
            }

            if (c != 0) {
                System.out.print(Math.abs(c));
            }
        }
    }
}
