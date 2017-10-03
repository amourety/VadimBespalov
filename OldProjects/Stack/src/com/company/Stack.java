package com.company;

/**
 * Created by amour on 08.02.2017.
 */
public class Stack<T> implements Sequence<T>{
    private T[] a;
    private int size = 0;
    private int max = 0;

    public Stack(int size){
        this.a = (T[]) (new Object[size]);
        this.max = size;
    }

    @Override
    public void push(T obj) {
        if(size + 1 > max){
            System.out.println("Нет места");
        }
        else {
            a[size] = obj;
            size++;
        }
    }

    @Override
    public Object pop() {
        size--;
        return a[size+1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void fill(T object, int ammount) {
        for (int i = 0; i < ammount;i++){
            a[i] = object;
        }
    }

    @Override
    public String toString() {
        String q = "";
        for (int i = 0; i < size; i++){
            q += a[i] + " ";
        }
        return q;
    }
}
