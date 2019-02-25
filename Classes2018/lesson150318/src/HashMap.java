/**
 * Created by amour on 15.03.2018.
 */
public class HashMap<K,V> implements Map<K,V> {
    private LinkedList<K,V>[] stack;
    private static final int COUNT = 10;

    public HashMap(){
        stack = new LinkedList[COUNT];
    }
    @Override
    public void put(K key, V value){
        if(stack[hash(key)] == null){
            stack[hash(key)] = new LinkedList<>();
        }
        boolean b = true;
        for(int i = 0; i < stack[hash(key)].getSize() && stack[hash(key)] != null; i++){
            if(stack[hash(key)].get(i).key.equals(key)){
                stack[hash(key)].set(key,value,i);
                b = false;
                break;
            }
        }
        if(b) {
            stack[hash(key)].add(key, value);
        }
    }
    @Override
    public V get(K key){
        int index = hash(key);
        for (int i = 0; i < stack[index].getSize(); i++){
            if (stack[index].get(i).key.hashCode() == key.hashCode() && (stack[index].get(i).key.equals(key))){
                return stack[index].get(i).value;
            }
        }
        throw new IllegalArgumentException("There is no such key");
    }


    private int hash(K key){
        return Math.abs(key.hashCode() % COUNT);
    }
}
