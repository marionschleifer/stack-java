package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyStack<T> {
    T[] list = (T[]) new Object[5];
    int size = 0;

    public void push(T element) {
        checkArrayLength();
        list[size] = element;
        size += 1;
    }

    public int size() {
        return size;
    }

    public T peek() {
        return list[size - 1];
    }

    public T pop() {
        T element = list[size - 1];
        list[size - 1] = null;
        size--;
        return element;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for(int i = 0; i < size - 1; i++) {
            list[i] = null;
        }
    }

    private void checkArrayLength() {
        if(size + 1 > list.length) {
            T[] newList = (T[]) new Object[10];
            for(int i = 0; i > list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
    }
}
