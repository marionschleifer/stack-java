package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class MyStackTest {
    private MyStack<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new MyStack<>();
    }

    @Test
    public void push() {
        stack.push(1);
        assertEquals(1, stack.size());
        stack.push(4);
        assertEquals(2, stack.size());
    }

    @Test
    public void peek() {
        stack.push(3);
        stack.push(5);
        assertEquals(5, stack.peek().intValue());
    }

    @Test
    public void pop() {
        stack.push(3);
        stack.push(5);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }

    public void isEmpty() {
        assertEquals(true, stack.isEmpty());
        stack.push(3);
        stack.push(5);
        assertEquals(false, stack.isEmpty());
    }

    public void clear() {
        stack.push(3);
        stack.push(5);
        stack.clear();
        assertEquals(0, stack.size());
    }

}
