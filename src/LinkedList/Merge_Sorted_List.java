package LinkedList;


import static LinkedList.Reverse_LL.printList;

public class Merge_Sorted_List {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node -> 0
        ListNode returnNode = new ListNode(0);
        ListNode headNode = returnNode; //-> 0
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {

                returnNode.next = list1;

                list1 = list1.next;
            } else {
                returnNode.next = list2;
                list2 = list2.next;

            }
            if (list1.next == null) {
                returnNode.next = list2;
            } else {
                returnNode.next = list1;
            }
        }
        return headNode.next; // here headNode.next because the returnNode is at the last position, and we store the first node in headNode.next cause in headNode there is 0 so we need to return from the headNode.next.

    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        mergeTwoLists(head1, head2);

    }
}
