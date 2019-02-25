package Task1;

/**
 * Created by amour on 13.02.2018.
 */
public interface List<T> extends Collection<T> {
    Object get(int index);
    void addToBegin(T element);
    void add(T element);
}
