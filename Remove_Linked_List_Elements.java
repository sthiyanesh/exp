public class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode header = null;
        ListNode prev = null;;
        while(temp!=null){
            if(temp.val==val){
                if(prev!=null)
                    prev.next=temp.next;
                else{
                    prev = temp.next;
                }
            }else{
                prev=temp;
                if(header==null)
                    header=temp;
            }
            temp=temp.next;
        }
        return header;
    }
}
