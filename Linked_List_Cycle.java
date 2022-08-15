public class Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode a=head;
        ListNode b=head.next;
        while(a!=b){
            if(b==null||b.next==null)
                return false;
            a=a.next;
            b=b.next.next;
        }
        return true;
    }
}
