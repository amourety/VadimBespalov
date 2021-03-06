package com.company;

public interface Map<T, Q> {
    void add(Q key, T element);
    void set(Q key,T element);
    Object getElement(Q key);
    void removeByKey (Q key);
    Q[] getKeys();
    T[] getValues();
}
