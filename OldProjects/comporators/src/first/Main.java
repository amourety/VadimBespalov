package first;

/**
 * Created by amour on 01.03.2017.
 */

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[0];
        String s;
        while (!(s = sc.next()).equals("exit")){
            String[] newStrings = new String[strings.length + 1];
            System.arraycopy(strings, 0, newStrings, 0, strings.length);
            newStrings[newStrings.length - 1] = s;
            strings = newStrings;
        }
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}