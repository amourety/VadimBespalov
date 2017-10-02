/**
 * Created by amour on 27.04.2017.
 */
public class RadixSort {

    public static void sortLSD(int[] array) {
        int max = getMax(array);

        for (int rank = 1; max / rank > 0; rank *= 10)
            digitCountSort(array, rank);
    }

    private static int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    private static void digitCountSort(int array[], int rank) {
        int result[] = new int[array.length];
        int count[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            count[(array[i] / rank) % 10]++;
        }

        int c = 0, t;

        for (int i = 0; i < 10; i++) {
            t = count[i];
            count[i] = c;
            c += t;
        }

        for (int i = 0; i < array.length; i++) {
            result[count[(array[i] / rank) % 10]] = array[i];
            count[(array[i] / rank) % 10]++;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = result[i];
        }
    }
}
