package LinkedList;

public class Reverse_LL {

    public static void main(String[] args) {


      Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Original List");
        printList(head);

        System.out.println("Reversed List");
        head = reverseList(head);
        printList(head);
    }
    public static Node reverseList(Node head){
        Node prev= null;
        Node curr = head;

        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
        return head;

    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
