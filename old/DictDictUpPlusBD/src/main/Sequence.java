package main;

/**
 * Created by amour on 08.02.2017.
 */
public interface Sequence<T> {
    void push(T obj);
    Object pop();
    int size();
    void fill(T object, int ammount);
}
