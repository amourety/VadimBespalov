/**
 * Created by amour on 06.09.2017.
 */

//последовательность чисел последнее -1,
    //посчитать произведение чисел сумма цифр которых - четное число, и сумму числп заканчивающихся на 7.
import java.util.Scanner;
public class HomeTask1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        int p = 1;
        while (a!=-1){
            a = sc.nextInt();
            int n = a;
            while(n!=0) {
                sum = sum + (n % 10);
                n/=10;
                if (sum % 2 == 0) {
                    p *= a;
                }
            }
        }
        System.out.println("Произведение равно:" + p);
    }

}
