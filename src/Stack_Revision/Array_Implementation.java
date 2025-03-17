package Stack_Revision;


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
            else {
                int temp = arr[size - 1];
                arr[size - 1] = 0;
                size--;
                return temp;

            }


        }

        void display() {
            for (var st : arr) {
                System.out.print(st + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        st.pop();

        st.display();
    }

}
