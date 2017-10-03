import java.util.Iterator;

/**
 * Created by amour on 17.03.2017.
 */
public class MyIterator<T extends Entry> implements Iterator<T> {
    private T current;

    public MyIterator(T head){
        current = head;
    }
    public boolean hasNext() {
        if (current.getNext() == null) {
            return false;
        }
        else {
            return true;
        }
    }
    public T next() {
        current = (T)current.getNext();
        return current;
    }
}
