package dz;

/**
 * Created by amour on 14.02.2017.
 */
public class Stack implements Sequence{
    private Object[] a;
    private int size = 0;
    @Override
    public void push(Object obj) {
        if (size == a.length) {
            System.out.println("Превышен размер");
        }
        else {
            a[size] = obj;
            size++;
        }
    }

    @Override
    public Object pop() {
        size--;
        return a[size+1];
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

    public Stack (int maxsize) {
        a = new Object[maxsize];
    }
}
