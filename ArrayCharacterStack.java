package dscodes.basicds;

import java.util.EmptyStackException;

public class ArrayCharacterStack implements CharacterStackADT {

    private char[] stackArray;
    private int top;

    public ArrayCharacterStack() {
        stackArray = new char[10];
        top = -1;
    }

    public ArrayCharacterStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be greater than 0");
        }
        stackArray = new char[initialCapacity];
        top = -1;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Stack is empty";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = top; i >= 0; i--) {
            sb.append(stackArray[i]).append(" ");
        }
        return sb.toString();
    }

    @Override
    public void push(char c) {
        if (top == stackArray.length - 1) {
            throw new RuntimeException("Stack overflow: Cannot push onto a full stack");
        }
        stackArray[++top] = c;
    }

    @Override
    public char pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    @Override
    public char peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
