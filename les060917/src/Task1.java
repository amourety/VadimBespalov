/**
 * Created by amour on 06.09.2017.
 */

//ДВОИЧНЫЕ ЧИСЛА
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        StringBuilder builder = new StringBuilder();
        int a = sc.nextInt();
        int b;
        while(a !=0 ) {
            b = a%2;
            builder.append(String.valueOf(b));
            a = a/2;
        }
        System.out.println("Его двоичный вид -");
        System.out.println(builder.reverse());
        System.out.println("Для числа 68 - ");
        for68();
    }
    public static void for68(){
        int b = 68;
        int a1,a2,a3,a4,a5,a6,a7;
        a1 = 68 % 2;
        a2 = 34 % 2;
        a3 = 17 % 2;
        a4 = 8 % 2;
        a5 = 4 % 2;
        a6 = 2 % 2;
        a7 = 1 % 2;
        System.out.print(a7 + "" + a6 + "" + a5 + "" + a4 + "" + a3 + "" + a2 + "" + a1);
    }
}
