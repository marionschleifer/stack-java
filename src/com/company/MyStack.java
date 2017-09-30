package com.company;

import java.util.ArrayList;

public class MyStack<T> {
    ArrayList<T> list = new ArrayList<T>();

    public void push(T element) {
        list.add(element);
    }

    public int size() {
        return list.size();
    }

    public T peek() {
        return list.get(size() - 1);
    }

    public T pop() {
        return list.remove(size() - 1);
    }

    public Boolean isEmpty() {
        return list.size() == 0;
    }

    public void clear() {
        list.clear();
    }
}
