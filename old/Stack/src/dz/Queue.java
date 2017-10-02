package dz;

/**
 * Created by amour on 14.02.2017.
 */
public class Queue implements Sequence{
    private Object[] a = new Object[100];
    private int size = 0;
    @Override
    public void push(Object obj) {
        a[size] = obj;
        size++;
    }

    @Override
    public Object pop() {
        Object b = a[0];
        for (int i = 1; i < size; i++){
            a[i - 1] = a[i];
        }
        size--;
        return b;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String q = "";
        for (int i = 0; i < size; i++){
            q += a[i] + " ";
        }
        return q;
    }
}
