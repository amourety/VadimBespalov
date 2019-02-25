package Task1;

import java.util.Iterator;

/**
 * Created by amour on 13.02.2018.
 */
public class ArrayList implements List {
    private static final int DEFAULT_SIZE = 10;
    private Object elements[];
    private int count;
    public ArrayList(){
        elements = new Object[DEFAULT_SIZE];
        count = 0;

    }
    @Override
    public void add(Object element) {
        if(count < elements.length){
            elements[count] = element;
            count++;
        }
    }

    @Override
    public void remove(Object element) {
        for(int i = 0 ; i < count; i ++){
            if(element.equals(elements[i])){
                for (int j = i; j < count; j++){
                    elements[j] = elements[j+1];
                }
                count--;
            }
        }

    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public void addToBegin(Object element) {

    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
