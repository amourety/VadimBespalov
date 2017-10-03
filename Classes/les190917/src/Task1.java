import java.util.Scanner;

/**
 * Created by amour on 19.09.2017.
 */
//bubbleSort - method
public class Task1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        printArray(bubbleSort(readArray()));
    }
    public static int[] readArray(){
        int count = sc.nextInt();
        int array[] = new int[count];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static int[] bubbleSort(int array[]){
        for (int i = 1; i < array.length; i++) {
            for (int j = i; (j >= 1) && (array[j] < array[j - 1]); j--) {
                int a = array[j];
                array[j] = array[j - 1];
                array[j - 1] = a;
            }
        }
        return array;
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
