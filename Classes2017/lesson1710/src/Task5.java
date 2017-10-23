import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by amour on 17.10.2017.
 */

//ДИАГОНАЛИ

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(" " + (int)a.charAt(0) + " " + (int)a.charAt(1));
        System.out.println(" " + (int)b.charAt(0) + " " + (int)b.charAt(1));
        int letter1 = a.charAt(0) - 'a' + 1;
        int number1 = a.charAt(1) - '0';
        int letter2 = b.charAt(0) - 'a' + 1;
        int number2 = b.charAt(1) - '0';
        if (a.charAt(0) >= 'A' && a.charAt(0) <= 'H' && b.charAt(0) >= 'A' && b.charAt(0) <= 'H') {
            if (a.charAt(1) >= '0' && a.charAt(1) <= '8' && b.charAt(1) >= '0' && b.charAt(1) <= '8') {
                if(abs(a.charAt(0) - b.charAt(0)) == abs(a.charAt(1) - b.charAt(1))){
                    System.out.println("SAME");
                }
                else
                {
                    if (Math.abs(letter1 + number1 - (letter2 + number2)) == 1 || Math.abs(letter1 - number1 - (letter2 - number2)) == 1){
                        System.out.println("NEIGHBOUR");
                    }
                    else {
                        System.out.println("WRONG");
                    }
                }
            }
        }
    }
}
