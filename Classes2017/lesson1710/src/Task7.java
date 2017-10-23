import java.util.Scanner;

/**
 * Created by amour on 23.10.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ( a + b > c && a + c > b && b + c > a){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
