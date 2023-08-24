package linked_list;

public class delete_middle {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null ||head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode prevslow=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prevslow=slow;
            slow=slow.next;
        }
        prevslow.next=prevslow.next.next;
        return head;
    }
}
