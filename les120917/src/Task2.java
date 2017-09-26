import java.util.Scanner;

/**
 * Created by amour on 12.09.2017.
 */

//выборка и пузырьком
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] m = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            m[i] = arr[i];

        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; (j >= 1) && (arr[j] < arr[j - 1]); j--) {
                int a = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = a;
            }
        }
        System.out.println("Пузырьком");
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int j = 1; j<=m.length-1; j++) {
            int k = m[j];
            for(int i=j-1; i>=0 && m[i]>k; i--) {
                m[i+1] = m[i];
                m[i]=k;
            }

        }
        System.out.println();
        System.out.println("Выборкой");
        System.out.println();
        for(int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }
}

