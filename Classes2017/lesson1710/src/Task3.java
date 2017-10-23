import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by amour on 17.10.2017.
 */

//ХОД КОНЕМ

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(" " + (int)a.charAt(0) + " " + (int)a.charAt(1));
        System.out.println(" " + (int)b.charAt(0) + " " + (int)b.charAt(1));
        if (a.charAt(0) >= 'A' && a.charAt(0) <= 'H' && b.charAt(0) >= 'A' && b.charAt(0) <= 'H'){
            if (a.charAt(1) >= '0' && a.charAt(1) <= '8' && b.charAt(1) >= '0' && b.charAt(1) <= '8'){
                if ((abs(a.charAt(0)-b.charAt(0)) == 2 && (abs(a.charAt(1) - b.charAt(1)) == 1)) ||
                        (abs(a.charAt(0)-b.charAt(0)) == 1 && (abs(a.charAt(1) - b.charAt(1)) == 2))){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}
