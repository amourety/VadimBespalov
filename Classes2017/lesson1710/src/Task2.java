import java.util.Scanner;

/**
 * Created by amour on 17.10.2017.
 */

//ХОД ПЕШКОЙ

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(" " + (int)a.charAt(0) + (int)a.charAt(1));
        System.out.println(" " + (int)b.charAt(0) + (int)b.charAt(1));
        if (a.charAt(0) == b.charAt(0) &&
                ((b.charAt(1) - a.charAt(1) == 1) ||
                        (b.charAt(1) - a.charAt(1) == 2 && a.charAt(0) == 'B' && b.charAt(0) == 'B')))
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
