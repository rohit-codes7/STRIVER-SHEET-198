package LinkedList;

import java.util.List;

public class remove_Node_From_End {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode firstPtr = dummy;
        ListNode secondPtr = dummy;

        //Move second Ptr n spaces ahead
        for (int i = 0; i < n; i++) {
            secondPtr=secondPtr.next;

        }
        while (secondPtr.next!=null){
            firstPtr=firstPtr.next;
            secondPtr=secondPtr.next;
        }
        firstPtr.next= firstPtr.next.next;
        return dummy.next;
    }


}
