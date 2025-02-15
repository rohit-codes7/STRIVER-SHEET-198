package Random;
import LinkedList.*;

public class Remove_Val_LL {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
           this.val=val;
        }
    }
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            if(temp.next.val==val){
                temp.next= temp.next.next;


            }else{
                temp=temp.next;

            }

        }
        return head;
    }
}
