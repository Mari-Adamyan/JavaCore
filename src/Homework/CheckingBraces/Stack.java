package Homework.CheckingBraces;

public class Stack {
    private char[] stack;
    int tos;

    Stack(int size) {
        stack = new char[size];
        tos = -1;
    }

    void push(char item) {
        if (tos == stack.length - 1) {
            System.out.println("The stack is full");
            return;
        }
        stack[++tos] = item;
    }

    char pop() {
        if (tos < 0) {
            System.out.println("The stack is empty");
            return 0;
        }
        else {
            return stack[tos--];
        }
    }
}
