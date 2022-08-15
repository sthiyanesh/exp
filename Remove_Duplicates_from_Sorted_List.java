public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode a = head;
        ListNode b = head;
        head=head.next;
        while(head!=null){
            if(head.val!=a.val){
                a.next=head;
                a=a.next;
            }
            head=head.next;
        }
        a.next=null;
        return b;
    }
}
