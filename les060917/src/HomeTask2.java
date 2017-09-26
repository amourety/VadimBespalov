import java.util.Scanner;

/**
 * Created by amour on 06.09.2017.
 */

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = 0;
        while(a != -1){
            a = sc.nextInt();
            if(a % 10 == 7){
                sum+=a;
            }
        }
        System.out.println("Сумма равна: " + sum);
    }
}
