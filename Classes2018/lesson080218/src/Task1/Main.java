package Task1;

import java.util.Scanner;

/**
 * Created by amour on 08.02.2018.
 */
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int s = 0;
        for(int i = 0; i < string.length(); i++){
            int count = 0;
            for(int j = i; j < string.length(); j++ ){
                if(string.charAt(i) < string.charAt(j)){
                    count++;
                }
            }
            s+= count * factorial(string.length() - 1 - i);
        }
        System.out.println(s);

    }
    public static int factorial(int n){
            int ret = 1;
            for (int i = 1; i <= n; ++i ) ret *= i;
            return ret;
    }
}

