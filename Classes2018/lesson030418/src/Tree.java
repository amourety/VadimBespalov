/**
 * Created by amour on 03.04.2018.
 */
public interface Tree<T extends Comparable<T>> {
    void insert (T value);
    boolean remove (T value);
    boolean contains(T value);
    void print();
    void printByLevels();
    boolean isBST();
}
