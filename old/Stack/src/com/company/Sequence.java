package com.company;

public interface Sequence<T> {
    void push(T obj);
    Object pop();
    int size();
    void fill(T object, int ammount);
}
