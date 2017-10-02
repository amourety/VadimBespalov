import java.util.Iterator;

/**
 * Created by amour on 17.03.2017.
 */
public class LinkedList<T> {
    private Entry<T> head;

    public LinkedList() {
        head = new Entry<T>(null, null);
    }
    public void add(T element) {
        if (head.getData() == null) {
            head = new Entry<T>(element,null);
        }
        else {
            Entry<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Entry(element, null));
        }
    }

    public boolean has(T element) {
        Entry<T> temp = head;
        if (head.getData() == element) {
            return true;
        }
        else {
            while (temp.getNext() != null) {
                if (temp.getNext().getData() == element) {
                    return true;
                }
                else {
                    temp = temp.getNext();
                }
            }
        }
        return false;
    }

    public void addAfter(T element, T afterThis) {
        boolean found = false;
        Entry<T> temp = head;
        if (head.getData() == afterThis) {
            head.setNext(new Entry(element, head.getNext()));
        }
        else {
            while ((temp.getNext() != null) & !found) {
                if (temp.getNext().getData() == afterThis) {
                    temp.getNext().setNext(new Entry(element, temp.getNext().getNext()));
                    found = true;
                }
                else {
                    temp = temp.getNext();
                }
            }
        }
    }

    public void remove(T element) {
        boolean found = false;
        Entry<T> temp = head;

        if (head.getData() == element) {
            head = head.getNext();
        }
        else {
            while ((temp.getNext() != null) & !found) {
                if (temp.getNext().getData() == element) {
                    temp.setNext(temp.getNext().getNext());
                    found = true;
                }
                else {
                    temp = temp.getNext();
                }
            }
        }
    }

    public MyIterator<Entry> iterator() {
        return new MyIterator<Entry>(head);
    }
}

class Entry<T> {
    private final T data;
    private Entry next;

    public Entry(T data, Entry next) {
        this.data = data;
        this.next = next;
    }

    public Entry getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setNext(Entry next) {
        this.next = next;
    }
}