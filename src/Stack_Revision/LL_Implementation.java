package Stack_Revision;

public class LL_Implementation {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }

    public static class LL_Stack {
        Node head = null;
        int size = 0;

        //push method
        void push(int data) {
            Node temp = new Node(data);
            temp.next=head;
            head = temp;
        }

        void pop(){
            
        }
    }
}
