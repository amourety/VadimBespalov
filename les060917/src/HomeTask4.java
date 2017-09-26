import java.util.Scanner;

/**
 * Created by amour on 06.09.2017.
 */
public class HomeTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum+=sc.nextInt();
        }
        System.out.println("НЕНАПИСАННОЕ ЧИСЛО - " + (5050 - sum));
    }
}
