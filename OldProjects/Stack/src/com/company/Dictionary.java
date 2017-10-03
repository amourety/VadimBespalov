package com.company;

public class Dictionary <T, Q> implements Map<T, Q>{

    private int count = 0;
    private int MAX_SIZE = 100;
    private Object[] elements = new Object[MAX_SIZE];
    private Object[] keys = new String[MAX_SIZE];
    private int index;
    private boolean flag;

    @Override
    public void add(Q key, T element) {
        if(count > MAX_SIZE){
            resize();
        }
        checkKey(key);

        if (flag == false){
            keys[count] = key;
            elements[count] = element;
            count++;
        }else {
            set(key, element);
        }

    }

    private void resize(){
        MAX_SIZE += 150;
        Object newArray[] = new Object[MAX_SIZE];

        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }

        elements = newArray;

    }

    private void checkKey(Q key){
        flag = false;
        for (int i = 0; i < count; i++){
            if (key.equals(keys[i])){
                flag = true;
                index = i;
            }
            if (flag){
                break;
            }
        }

    }

    private int getCount(){
        return count;
    }



    @Override
    public void set(Q key, T element) {
        checkKey(key);
        if (flag){
            elements[index] = element;
        } else {
            System.out.println("error");
        }
    }

    @Override
    public T getElement(Q key) {
        checkKey(key);
        Object neededElement;
        if (flag){
            neededElement = elements[index];
        } else {
            neededElement = null;
        }
        return (T)neededElement;
    }

    @Override
    public void removeByKey(Q key) {
        checkKey(key);
        if (flag){
            for (int i = index; i < count; i++){
                elements[i] = elements[i + 1];
            }
            count--;
        }else {
            System.out.println("there is no elements wit this key");
        }
    }

    @Override
    public Q[] getKeys() {
        return (Q[])keys;
    }

    @Override
    public T[] getValues() {
        return (T[])this.elements;
    }
}
