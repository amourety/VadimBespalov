package sorter;

/**
 * Created by amour on 20.02.2018.
 */
public class Sorter {
    public static <T extends Comparable<T>> void sort(T arr[]){
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

    }
}
