/**
 * Created by amour on 20.02.2018.
 */
public interface Container<T> {
    void put(T value);
    T get();
}
