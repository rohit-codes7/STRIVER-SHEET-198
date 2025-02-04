package LinkedList;


public class Delete_Node {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        deletNode(head.next);

    }

    static void deletNode(ListNode node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
