import java.util.Scanner;

/**
 * Created by amour on 19.09.2017.
 */
//integral sin(1/x) from 0 to 1
public class Task3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println("Definite integral equals ~" + integrate(a,b,Math.abs(a-b)/n));

    }
    public static double function(double a){
        return Math.sin(1/a);
    }
    public static double integrate(double a, double b, double step){
        double result = 0;
        for (double i = a; i <= b; i = i + step){
            if (i != 0){
                result = result + step * function(i);
            }
        }
        return result;
    }
}
