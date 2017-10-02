import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Created by amour on 01.03.2017.
 */
public class LinkedList<T> extends AbstractCollection {
    private T[] list;

    public LinkedList(){
        this.list = (T[])(new Object[0]);
    }

    @Override
    public Iterator iterator() {
        Iterator<T> it = new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
        return it;
    }

    @Override
    public int size() {
        return this.list.length;
    }
    private static class Entry<E>
    {
        E element;
        Entry<E> next;
        Entry<E> prev;

        Entry(E element, Entry<E> next, Entry<E> prev)
        {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private Entry<T> entry(int index)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);

        Entry<T> e = header;

        if (index < (size >> 1))
        {
            for (int i = 0; i <= index; i++)
                e = e.next;
        }
        else
        {
            for (int i = size; i > index; i--)
                e = e.prev;
        }

        return e;
    }

}
