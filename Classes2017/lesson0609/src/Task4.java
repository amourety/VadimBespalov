import java.util.Scanner;

/**
 * Created by amour on 06.09.2017.
 */

//СУММА ЧЕТНЫХ
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, s = 0;
        System.out.println("Введите числа, для окончания напишите -1");
        while(a != -1){
            a = sc.nextInt();
            if (a % 2 ==0) {
                s += a;
            }
        }
        System.out.println("СУММА ЧЕТНЫХ - " + s);
    }
}
