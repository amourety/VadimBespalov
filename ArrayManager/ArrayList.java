package ArrayManager;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by amour on 18.09.2017.
 */

public class ArrayList {
    private final static String EXCEPTION = "ARRAY IS NOT CREATED, CREATE AN ARRAY";
    private static int[] array;
    private static int maxCount, count;
    private static Scanner scanner = new Scanner(System.in);
        public static void create(){
            System.out.println("ENTER MAXCOUNT FOR ARRAY");
            maxCount = scanner.nextInt();
            count = maxCount;
            array = new int[maxCount];
            System.out.println();
            for (int i = 0; i < maxCount; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("ARRAY CREATED");
        }
        public void expand(){
            array = Arrays.copyOf(array, array.length*2);
            maxCount *=2;
            System.out.println("ARRAY EXPANDED");
        }
        public void add(){
            if (array != null){
                if (count != maxCount) {
                    array[count] = scanner.nextInt();
                    count += 1;
                    System.out.println("ELEMENT ADDED");
                }
                else {
                    expand();
                    add();
                }
            } else {
                System.out.println(EXCEPTION);
            }
        }
        public void remove(){
            if (array != null){
                int elementPosition = scanner.nextInt()-1;
                for (int i = elementPosition; i< maxCount -1; i++) {
                    array[i] = array[i+1];
                }
                count -= 1;
                System.out.println("ELEMENT REMOVED");
            } else {
                System.out.println(EXCEPTION);
            }
        }
        public void insert(){
            if (array != null){
                if (count != maxCount) {
                    int insertPosition = scanner.nextInt()-1;
                    int element = scanner.nextInt();
                    for (int i = count - 1; i > insertPosition; i--) {
                        array[i] = array[i - 1];
                    }
                    array[insertPosition] = element;
                    count += 1;
                    System.out.println("ELEMENT ADDED");
                } else {
                    expand();
                    insert();
                }
            } else {
                System.out.println(EXCEPTION);
            }
        }
        public void print(){
            System.out.println("ELEMENTS OF ARRAY \n");
            if (array != null){
                for (int i = 0; i < count; i++) {
                    System.out.print(array[i] + " ");
                }
            } else {
                System.out.println(EXCEPTION);
            }
        }
    }

