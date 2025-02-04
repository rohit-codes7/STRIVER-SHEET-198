package LinkedList;

public class Middle_LL {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Find the middle node
        ListNode middleNode = MiddleLL(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);

    }

    static ListNode MiddleLL(ListNode head){
        if (head==null || head.next==null) return head;
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null && fast!=null){
            fast = fast.next.next;
            slow= slow.next;
        }
        return slow;
    }

    static ListNode findMiddleOfLL(ListNode head) {                 // T.C -> O(N+N/2)  S.C -> 0(1)

        if (head == null || head.next == null) {
            return head;
        }

        // step 1 : Count the nodes
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        int middle = (count / 2) + 1;
        while (temp != null) {
            middle = middle - 1;

            if (middle == 0) {
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
}
