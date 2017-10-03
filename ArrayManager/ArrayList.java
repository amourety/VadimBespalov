package ArrayManager;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by amour on 18.09.2017.
 */

public class ArrayList {
    private final static String EXCEPTION = "ARRAY IS NOT CREATED, CREATE AN ARRAY";
    private int[] array;
    private int maxCount, count;
        public void create(int a){
            System.out.println("ENTER MAXCOUNT FOR ARRAY");
            maxCount = a;
            count = 0;
            array = new int[maxCount];
            System.out.println();
        }
        public void expand(){
            array = Arrays.copyOf(array, array.length*2);
            maxCount *=2;
            System.out.println("ARRAY EXPANDED");
        }
        public void add(int a){
            if (array != null){
                if (count != maxCount) {
                    array[count] = a;
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
        public void remove(int a){
            if (array != null){
                int elementPosition = a - 1;
                for (int i = elementPosition; i< maxCount -1; i++) {
                    array[i] = array[i+1];
                }
                count -= 1;
                System.out.println("ELEMENT REMOVED");
            } else {
                System.out.println(EXCEPTION);
            }
        }
        public void insert(int a, int b){
            if (array != null){
                if (count != maxCount) {
                    int insertPosition = a-1;
                    int element = b;
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

