import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by amour on 06.09.2017.
 */

//РАЗНИЦА МЕЖДУ МАКСИМУМОМ И МИНИМУМОМ
public class HomeTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = a; int min = a;
        while(a!= -1){
            a = sc.nextInt();
            if (a > max & a!=-1){
                max = a;
            }
            if (a < min & a!=-1){
                min = a;
            }
        }
        System.out.println(max + "-" + min + "=");
        System.out.println(max-min);
    }
}
