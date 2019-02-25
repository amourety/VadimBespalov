/**
 * Created by amour on 22.03.2018.
 */
public class SmoothSorter {

    private static int heapSize;

    public static void sort(int[] a) {
        buildHeap(a);
        while (heapSize > 1) {
            swap(a, 0, heapSize - 1);
            heapSize--;
            heapify(a, 0);
        }
    }

    private static void buildHeap(int[] a) {
        heapSize = a.length;
        for (int i = a.length / 2; i >= 0; i--) {
            heapify(a, i);
        }
    }


     // Переупорядочивает поддерево кучи начиная с узла i так, чтобы выполнялось
     // a[parent] >= a[child].
    // i - корень поддерева

    private static void heapify(int[] a, int i) {
        int l = left(i);
        int r = right(i);
        int lar = i;
        if (l < heapSize && a[i] < a[l]) {
            lar = l;
        }
        if (r < heapSize && a[lar] < a[r]) {
            lar = r;
        }
        if (i != lar) {
            swap(a, i, lar);
            heapify(a, lar);
        }
    }


     // Возвращает индекс правого потомка текущего узла
    // i - индекс текущего узла кучи
    private static int right(int i) {
        return 2 * i + 1;
    }


    // Возвращает индекс левого потомка текущего узла
    // i - индекс текущего узла кучи
    private static int left(int i) {
        return 2 * i + 2;
    }

     // Меняет местами два элемента в массиве
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
