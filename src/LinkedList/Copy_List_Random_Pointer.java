package LinkedList;

public class Copy_List_Random_Pointer {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static void main(String[] args) {

    }

    static Node RandomList(Node head) {
        if (head == null) return null;

        Node curr = head;   // making copy of the nodes and inserting in the middle of each node
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        curr = head; // copy the random pointers
        while (curr != null) {
            if (curr.random != null) curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        curr = head; // Separate the two lists
        Node newHead = head.next;
        Node newCurr = newHead;
        while (curr != null) {
            curr.next = newCurr.next;
            curr = curr.next;

            if (curr != null) {
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        }
        return newHead;
    }
}
