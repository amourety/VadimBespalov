import java.util.Scanner;

/**
 * Created by amour on 23.10.2017.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        if (n.length() == 6){
            int [] c = new int[6];
            for (int i = 0; i < 6; i++){
                c[i] = n.charAt(i) - '0';
                System.out.println(c[i]);
            }
            if (c[5] == c[0] && c[4] == c[1] && c[3] == c[2]){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}
