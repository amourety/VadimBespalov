import java.util.Scanner;

/**
 * Created by amour on 19.09.2017.
 */

//ПРОВЕРКА НА ПРОСТОЕ
public class Task2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        if(isPrime(sc.nextInt())){
            System.out.println("Simple");
        }
        else {
            System.out.println("Not simple");
        }
    }
    public static boolean isPrime(int a){
        if (a == 2 || a == 3)
            return true;
        if (a == 1)
            return false;
        for (int i = 2; i*i <= a ; i++)
            if (a % i == 0)
                return false;
        return true;
    }
}
