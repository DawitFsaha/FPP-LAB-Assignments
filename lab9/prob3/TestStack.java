package lab9.prob3;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        try {
            System.out.println("Push 10, 20, 30");
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Stack: " + stack);

            // Overflow test
            System.out.println("\nAttempting overflow push...");
            stack.push(40);
        } catch (IllegalStateException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            // Null push test
            System.out.println("\nAttempting null push...");
            stack.push(null);
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            // Normal pop
            System.out.println("\nPop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());

            // Underflow pop
            System.out.println("\nAttempting pop on empty stack...");
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Caught Exception: Stack Underflow - cannot pop from empty stack.");
        }

        try {
            // Underflow peek
            System.out.println("\nAttempting peek on empty stack...");
            stack.peek();
        } catch (EmptyStackException e) {
            System.out.println("Caught Exception: Stack Underflow - cannot peek from empty stack.");
        }
    }
}