package LinkedList;

import java.util.List;

public class RotateList {
    public static void main(String[] args) {

    }

    static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        k = k % length;

        for (int i = 0; i < k; i++) {
            temp = head;
            while (temp.next.next != null) temp = temp.next;
            ListNode end = temp.next;
            temp.next = null;
            end.next = head;
            head = end;
        }
        return head;
    }
}
