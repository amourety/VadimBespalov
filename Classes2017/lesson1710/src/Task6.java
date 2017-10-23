import java.util.Scanner;

/**
 * Created by amour on 23.10.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ( n >= 1 && n <=9999){
            if( (n % 4 == 0 && n % 100 != 0) || n % 400 == 0){
                System.out.println("12.09." + n);
            }
            else {
                System.out.println("13.09." + n );
            }

        }

    }
}
