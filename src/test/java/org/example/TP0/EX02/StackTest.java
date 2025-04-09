package org.example.TP0.EX02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    @DisplayName("stack empty, can i pop??")
    void stackEmptyPopTest(){
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::pop);
    }
    @Test
    @DisplayName("stack expansion does it work??")
    void stackExpansionTest() {
        Stack stack = new Stack();
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        assertEquals(15, stack.size());
        assertEquals(14, stack.peek());

        // Pop all elements
        for (int i = 14; i >= 0; i--) {
            assertEquals(i, stack.pop());
        }
        assertTrue(stack.isEmpty());
    }
    @Test
    @DisplayName("init stack: empty, size zero")
    void initStackTest(){
        //arrange
        Stack stack = new Stack();
        //act + assert
        assertTrue(stack.isEmpty(), "new stack should be empty");
        assertEquals(0, stack.size(), "size should be init at zero");
    }
    @Test
    @DisplayName("push then pick?")
    void pushPickTest(){
        int value = 2025;
        Stack stack = new Stack();
        stack.push(value);
        assertFalse(stack.isEmpty(), "stack shouldn't be empty");
        assertEquals(value, stack.peek(), "value should be 5");
        assertEquals(1, stack.size(), "size should be 1");
    }
    @Test
    @DisplayName("FIFO is it correct?")
    void FIFOTest(){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertAll(
                ()->assertEquals(3, stack.pop(), "value should be 3"),
                ()->assertEquals(2, stack.pop(), "value should be 2"),
                ()->assertEquals(1, stack.pop(), "value should be 1")
        );
    }
    @Test
    @DisplayName("no peek on empty stack?")
    void EmptyStackPeekTest(){
        Stack stack = new Stack();
        Exception exception = assertThrows(IllegalStateException.class, stack::peek);
    }

    @Test
    void push() {
    }

    @Test
    void pop() {
    }

    @Test
    void peek() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void size() {
    }
}