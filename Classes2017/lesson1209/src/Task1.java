import java.util.Scanner;

/**
 * Created by amour on 12.09.2017.
 */

//поменять местами min и max
public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел?");
        int n = sc.nextInt();
        System.out.println("Введите числа");
        int a[] = new int[n];
        a[0] = sc.nextInt();
        int max = a[0];
        int min = a[0];
        int imax = 0;
        int imin = 0;
        for (int i = 1; i < n; i++){
            a[i] = sc.nextInt();
            if (a[i]> max){
                max = a[i];
                imax = i;
            }
            if (a[i]<min){
                min = a[i];
                imin = i;
            }
        }
        System.out.println();
        for (int i = 0; i < n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Поменять max и min");
        System.out.println();
        int y = a[imax];
        a[imax] = a[imin];
        a[imin] = y;
        System.out.println();
        for (int i = 0; i < n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
