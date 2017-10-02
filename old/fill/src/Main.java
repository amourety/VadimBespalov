/**
 * Created by amour on 01.03.2017.
 */
public class Main {
    public static void main(String args[]){

    }
    public static <T> void fill(T[] array, T element){
        for (int i = 0; i < array.length;i++){
            array[i] = element;
        }
    }
    public static <T> T[] copyOfRange(T[] array, int from, int count) {
        if (from + count > array.length)
            throw new IllegalArgumentException("Неверные параметры");

        T[] result = (T[]) new Object[count];
        for (int i = from; i < from + count; i++)
            result[i] = array[i];
        return result;
    }

    public static <T> String toString(T[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i].toString();
            if (i != array.length - 1)
                result += ", ";
        }
        return result + "]";
    }
}
