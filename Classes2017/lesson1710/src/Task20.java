import java.util.Scanner;

/**
 * Created by amour on 23.10.2017.
 */
public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();
        if (n1.length() == 6 && n2.length() == 6) {
            int[] c = new int[6];
            for (int i = 0; i < 6; i++) {
                c[i] = (((n1.charAt(i) - '0') + (n2.charAt(i) - '0')) % 10);
                System.out.println(c[i]);
            }
            if (c[0] + c[1] + c[2] == c[3] + c[4] + c[5]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
