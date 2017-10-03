package main;

/**
 * Created by amour on 28.02.2017.
 */
public interface Map<T, Q> {
    void add(Q key, T element);
    void set(Q key,T element);
    Object getElement(Q key);
    void removeByKey (Q key);
    Q[] getKeys();
    T[] getValues();
}
