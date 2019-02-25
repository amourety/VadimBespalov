package Task1;

/**
 * Created by amour on 13.02.2018.
 */
public interface Collection<T> extends Iterable<T> {
    void add(T element);
    void remove(T element);
    boolean contains(T element);
}
