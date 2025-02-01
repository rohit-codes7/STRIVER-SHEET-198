package LinkedList;


import java.util.LinkedList;


public class Reverse_LL {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
      ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Original List");
        printList(head);

        System.out.println("Reversed List");
        head = reverseList(head);
        printList(head);
    }
    public static ListNode reverseList(ListNode head){
        ListNode prev= null;
        ListNode  curr = head;

        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
        return head;

    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
