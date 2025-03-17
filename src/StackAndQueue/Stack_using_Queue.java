package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public  class Stack_using_Queue {
  static   class MyStack {

        private Queue<Integer> q;

        public MyStack() {
            q = new LinkedList<>();

        }

        public void push(int x) {
            q.add(x);
            for (int i = 0; i < q.size() - 1; i++) {
                q.add(q.poll());
            }

        }

        public int pop() {
            return q.poll();

        }

        public int top() {
            return q.peek();

        }

        public boolean empty() {
            return q.isEmpty();

        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
    }

}