package com.company;

public class Queue<T> implements Sequence<T>{
    private T[] a;
    private int size = 0;
    private int max = 0;

    public Queue(int size){
        this.a = (T[]) (new Object[size]);
        this.max = size;
    }

    @Override
    public void push(T obj) {
        if(this.size + 1 > this.max){
            System.out.println("Нет места");
        }
        else {
            this.a[size] = obj;
            this.size++;
        }
    }

    @Override
    public Object pop() {
        Object b = a[0];
        for (int i = 1; i < size; i++){
            this.a[i - 1] = this.a[i];
        }
        this.size--;
        return b;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void fill(T object, int ammount) {
        for (int i = 0; i < ammount;i++){
            this.a[i] = object;
        }
    }

    @Override
    public String toString() {
        String q = "";
        for (int i = 0; i < this.size; i++){
            q += this.a[i] + " ";
        }
        return q;
    }
}
