import java.util.Scanner;

/**
 * Created by amour on 06.09.2017.
 */

// [a,b] И [b,a]
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = b; i <= a; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
