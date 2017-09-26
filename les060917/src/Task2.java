/**
 * Created by amour on 06.09.2017.
 */

//ЧЕТНОСТЬ
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        if (a%2 == 0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}
