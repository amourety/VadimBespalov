/**
 * Created by amour on 20.02.2018.
 */
public class Box<V> implements Container<V>{
    private V value;
    @Override
    public void put(V value) {
        this.value = value;
    }
    @Override
    public V get(){
        return value;
    }
}

