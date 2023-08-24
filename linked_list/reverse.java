class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class reverse {
    public ListNode reverseList(ListNode head) {
        ListNode curt=head;
        ListNode prev=null;
        while(curt!=null){
            ListNode temp=curt.next;
            curt.next=prev;
            prev=curt;
            curt=temp; 
        }
        return prev;
        
    }
}
