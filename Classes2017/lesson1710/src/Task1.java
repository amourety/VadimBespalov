import java.util.IntSummaryStatistics;
import java.util.Scanner;

/**
 * Created by amour on 17.10.2017.
 */

//БЕЛОЕ ЧЕРНОЕ

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println((int)a.charAt(0));
        System.out.println((int)a.charAt(1));
        if (((int)a.charAt(1) + (int)a.charAt(0))/ 2 == 0){
            System.out.println("WHITE");
        }
        else{
            System.out.println("BLACK");
        }
    }
}
