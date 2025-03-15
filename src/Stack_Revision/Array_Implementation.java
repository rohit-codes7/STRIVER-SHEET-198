package Stack_Revision;

import java.util.EmptyStackException;
import java.util.Stack;

public class Array_Implementation {
    private static class Stack {
        int[] arr = new int[5];
        private int size = 0;

        boolean isFull() {
            if (size == arr.length) return true;
            return false;

        }

        boolean isEmpty() {
            if (size == 0) return true;
            return false;

        }

        void push(int value) {
            if (isFull()) {
                System.out.println("Stack is Full!");
            } else {
                arr[size] = value;
                size++;
            }

        }

        int peek() {
            if (size == 0) {
                throw new RuntimeException("Stack is Empty!");

            } else {
                return arr[size - 1];
            }

        }

        int pop() {
            if (isEmpty()) throw new RuntimeException("Stack is Empty");
            else{
                int temp = arr[size-1];
                arr[size-1] = 0;
                size--;
                return temp;

            }


        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.peek());
    }

}
